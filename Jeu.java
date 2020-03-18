import java.io.*;
import java.util.*;

public class Jeu{
	public static void main(String[] args) throws IOException, IndexOutOfBoundsException {
		try{
			Grille g = null;
			System.out.println("");
			Joueur j1 = new Joueur(true);
			System.out.println("");
			Joueur j2 = new Joueur(false);
			System.out.println("");
			Scanner sc = new Scanner(System.in);
			System.out.println("Voulez vous une grille par defaut ? oui/non ");
			String choix = sc.nextLine();
			int nbColonne = 0;
			switch (choix) {
				case "non":
					System.out.print("Sur combien de colonnes voulez vous jouer ? : ");
					nbColonne = sc.nextInt();
					while (nbColonne<2){
						System.out.println("Vous voulez jouer comment avec " + nbColonne + " colonnes?");
						System.out.print("Donnez un nombre correct : ");
						nbColonne = sc.nextInt();
					}
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
		} catch(IndexOutOfBoundsException e){
			System.out.println("Colonne inexistante");
		} catch(InputMismatchException ee){
			System.out.println("Ce n'est pas un nombre");
		} catch(NullPointerException np){
			System.out.println("Ce n'est pourtant pas compliquer de repondre oui ou non");
		}
	}

	public static int getRandomInt(int max) {
		return (int)(Math.floor(Math.random() * Math.floor(max)));
	}
}
