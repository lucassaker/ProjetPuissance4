import java.util.Scanner;
import java.io.*;

public class Ordinateur implements JoueurOrdinateurInterface{
  private String nom;
  private Jeton monJeton;
  private boolean premier;
  private int nbCol;
  Scanner sc = new Scanner(System.in);


  public Ordinateur(boolean first, int nb) throws IOException{
    this.nbCol = nb;
    this.premier = first;
    this.nom = nomRandom();
    if (first) System.out.print("L ordinateur joueras en premier et s'appel : " + this.nom);
    else System.out.print("L ordinateur joueras en deuxieme et s'appel : " + this.nom);
    this.monJeton = new Jeton(this.nom.charAt(0));
    System.out.print(this.nom + ", prend comme forme la lettre : " + this.monJeton.getForme());
  }

  public int jouer(){
    System.out.println("--- A " + this.nom + " de jouer!");
    int res = getRandomInt(this.nbCol)+1;
    System.out.println(this.nom + " joue sur la colonne " + res);
    return res;
  }

  public void gagner(){
    System.out.println("Bien jouer!");
  }

  public Jeton getJeton(){
    return this.monJeton;
  }

  public String nomRandom(){
    String consonnes = "bcdfghjklmnpqrstvxz"; //19
    String voyels = "aeiouy"; //6
    String nom = "";
    int longueur = getRandomInt(7) + 3;
    boolean alterne = true;
    for (int i = 0; i<longueur; i++){
      if (alterne) {nom = addChar(nom, consonnes.charAt(getRandomInt(18)), nom.length()) ; alterne = false;}
      else {nom = addChar(nom, voyels.charAt(getRandomInt(5)), nom.length()); alterne = true;}
    }
    nom = nom.substring(0, 1).toUpperCase() + nom.substring(1);
    return nom;
  }

  public String addChar(String str, char ch, int position) {
    int len = str.length();
    char[]updatedArr = new char[len + 1];
    str.getChars(0, position, updatedArr, 0);
    updatedArr[position]= ch;
    str.getChars(position, len, updatedArr, position + 1);
    return new String(updatedArr);
}

  public static int getRandomInt(int max) {
		return (int)(Math.floor(Math.random() * Math.floor(max)));
	}
}
