import java.util.*;
import java.io.*;

public class Grille{
  private ArrayList<Colonne> laGrille;

  public Grille(int a){
    if (a>0) this.laGrille = new ArrayList<Colonne>(a);
    else this.laGrille = new ArrayList<Colonne>(10);
    for(int i = 0; i<a; i++){
      this.laGrille.add(new Colonne());
    }
  }

  public void afficher(){
    for (int i = this.laGrille.get(0).taille()-1; i>=0; i--){
      for (int y = 0; y<this.laGrille.size(); y++){
        System.out.print(this.laGrille.get(y).getColonne().get(i).toString());
      }
      System.out.println("");
    }
  }

  public void ajouterJeton(Jeton j, int posMalone){
    boolean doitJeRajouterUneLigne = this.laGrille.get(posMalone-1).ajouterJeton(j);
    if (doitJeRajouterUneLigne == true){
      rajouterLigne();
    }
  }

  public void rajouterLigne(){
    for(int i = 0; i<this.laGrille.size(); i++){
      this.laGrille.get(i).getColonne().add(new Jeton());
    }
  }

  public ArrayList<Colonne> getGrille(){
    return this.laGrille;
  }

}
