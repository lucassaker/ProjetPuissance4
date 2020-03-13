import java.util.*;

public class Colonne{
  private List<Jeton> lesJetons;

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
    this.lesJetons.remove(this.lesJetons.taille()-1);
  }

  public ArrayList getColonne(){
    return this.lesJetons;
  }
}
