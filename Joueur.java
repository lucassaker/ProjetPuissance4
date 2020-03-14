import java.util.Scanner;
import java.io.*;

public class Joueur implements JoueurOrdinateurInterface{
  private String nom;
  private Jeton monJeton;
  private boolean premier;
  Scanner sc = new Scanner(System.in);


  public Joueur(boolean first) throws IOException{
    this.premier = first;
    if (first) System.out.print("Nom du premier joueur : ");
    else System.out.print("Nom du second joueur : ");
    this.nom = sc.nextLine();
    System.out.print(this.nom + ", donnez une forme qui vous correspond : ");
    String tmp = sc.nextLine();
    char c = tmp.charAt(0);
    this.monJeton = new Jeton(c);
  }

  public int jouer(){
    System.out.println("--- A " + this.nom + " de jouer!");
    System.out.println("Quelle colonne ? ");
    return sc.nextInt();
  }

  public void ceToucherLaQueue(){
    System.out.println("Bien jouer!");
  }

  public Jeton getJeton(){
    return this.monJeton;
  }
}
