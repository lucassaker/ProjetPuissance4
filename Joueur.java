import java.util.Scanner;
import java.io.*;

/**
 * class qui permet de définir le comportement d'un Joueur
 */
public class Joueur implements JoueurOrdinateurInterface{
	private String nom;
	private Jeton monJeton;
	private boolean premier;
	Scanner sc = new Scanner(System.in);

	/**
	 * constructeur de Joueur
	 * @param first
	 * @throws IOException
	 */
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

	/**
	 * methode qui permet d'annoncer que c'est au Joueur de jouer
	 * @return res en int
	 */
	public int jouer(){
		System.out.println("--- A " + this.nom + " de jouer!");
		System.out.println("Quelle colonne ? ");
		return sc.nextInt();
	}

	/**
	 * methode qui permet d'annoncer que c'est le Joueur qui a gagné
	 */
	public void gagner(){
		System.out.println("Bien jouer!");
	}

	/**
	 * methode qui permet de retourner un jeton celui du Joueur
	 * @return un jeton
	 */
	public Jeton getJeton(){
		return this.monJeton;
	}
}
