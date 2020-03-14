import java.io.*;
import java.util.*;

public class main{
  public static void main(String[] args) throws IOException, IndexOutOfBoundsException {
    Grille g = new Grille(15);
    int lol = getRandomInt(15) + 1;
    for (int i = 0; i<100; i++){
      lol = getRandomInt(15) + 1;
      g.ajouterJeton(new Jeton('a'), lol);
      lol = getRandomInt(15) + 1;
      g.ajouterJeton(new Jeton('b'), lol);
    }
    g.afficher();
  }
  public static int getRandomInt(int max) {
    return (int)(Math.floor(Math.random() * Math.floor(max)));
  }
}
