import java.io.*;
import java.util.*;

public class main{
  public static void main(String[] args) throws IOException, IndexOutOfBoundsException {
    Grille g = new Grille(15);
    Joueur j1 = new Joueur(true);
    Joueur j2 = new Joueur(false);
    for (int i = 0; i<10; i++){
      g.afficher();
      g.ajouterJeton(j1.getJeton(), j1.jouer());
      g.afficher();
      g.ajouterJeton(j2.getJeton(), j2.jouer());
    }
  }
  public static int getRandomInt(int max) {
    return (int)(Math.floor(Math.random() * Math.floor(max)));
  }
}
