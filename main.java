import java.io.*;
import java.util.*;

public class main{
  public static void main(String[] args) throws IOException {
    Grille g = new Grille(15);
    g.ajouterJeton(new Jeton('g'), 2);
    g.afficher();
  }
}
