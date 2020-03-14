import java.util.*;
import java.io.*;

public class Colonne{
  private ArrayList<Jeton> lesJetons;

  public Colonne(int a){
    if (a>=0) this.lesJetons = new ArrayList<Jeton>(a);
    else this.lesJetons = new ArrayList<Jeton>(0);
    remplirColonne();
  }

  public Colonne(){
    this.lesJetons = new ArrayList<Jeton>(0);
    for (int i = 0; i<1; i++){
      this.lesJetons.add(new Jeton());
    }
  }

  public void remplirColonne(){
    for (int i = 0; i<this.lesJetons.size(); i++){
      this.lesJetons.add(new Jeton());
    }
  }

  public boolean ajouterJeton(Jeton j){
    int i = 0;
    while (this.lesJetons.get(i).getForme() != '.'){
      i++;
    }
    this.lesJetons.get(i).modifForme(j.getForme());
    boolean res = true;
    if (i != this.lesJetons.size()-1){
      res = false;
    }
    return res;
  }

  public int taille(){
    return this.lesJetons.size();
  }

  public void removeEnHaut(){
    this.lesJetons.remove(this.lesJetons.size());
  }

  public ArrayList<Jeton> getColonne(){
    return this.lesJetons;
  }

  public void afficher(){
    for (int i = this.lesJetons.size()-1; i>0; i--){
      System.out.println(this.lesJetons.get(i).toString());
    }
  }

  public static void main(String[] args) throws IOException{
    Colonne c = new Colonne();
    c.ajouterJeton(new Jeton('g'));
    c.afficher();
  }
}
