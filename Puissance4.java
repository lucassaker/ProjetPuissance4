import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException, IndexOutOfBoundsException {
		Grille g = null;
		Joueur j1 = new Joueur(true);
		Joueur j2 = new Joueur(false);
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez vous une grille par defaut ? oui/non ");
		String choix = sc.nextLine();
		switch (choix) {
			case "non":
				System.out.println("Sur combien de colonnes voulez vous jouer ? : ");
				int nbColonne;
				nbColonne = sc.nextInt();
				g = new Grille(nbColonne);
				break;
	
			case "oui":
				g = new Grille(10);
				break;
	
			default:
				break;
		}
		
		boolean fini = false;
		int res = 1;
		
		while(!(fini)) {
			g.afficher();
			g.ajouterJeton(j1.getJeton(), j1.jouer());
			g.afficher();
			g.ajouterJeton(j2.getJeton(), j2.jouer());
			System.out.println("Vous etes a " + res++ + " coups.");
		}
	}
	public static int getRandomInt(int max) {
		return (int)(Math.floor(Math.random() * Math.floor(max)));
	}
}
