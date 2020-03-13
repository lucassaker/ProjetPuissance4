import java.util.*;

public class Colonne{
  private ArrayList<Jeton> lesJetons;

  public Colonne(){
    this.lesJetons = new ArrayList<Jeton>(0);
  }

  public void ajouterJeton(Jeton j){
    this.lesJetons.add(j);
  }

  public int taille(){
    return this.lesJetons.size();
  }

  public void removeEnHaut(){
    this.lesJetons.remove(this.lesJetons.size()-1);
  }

  public ArrayList<Jeton> getColonne(){
    return this.lesJetons;
  }
}
