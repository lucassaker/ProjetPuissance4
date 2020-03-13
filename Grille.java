import java.util.*;

public class Grille{
  private ArrayList<Colonne> laGrille;

  public Grille(int a){
    if (a>0) this.laGrille = new ArrayList<Colonne>(a);
    else this.laGrille = new ArrayList<Colonne>(10);
  }

}
