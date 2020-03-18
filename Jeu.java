import java.io.*;
import java.util.*;

public class Jeu{
	public static void main(String[] args) throws IOException, IndexOutOfBoundsException {
		try{
//-----------------initialisation de la grille-----------------------------
			Grille g = null;
			JoueurOrdinateurInterface j1 = null;
			JoueurOrdinateurInterface j2 = null;
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
					nbColonne = 10;
					g = new Grille(10);
					break;

				default:
					break;
			}
//----------------------------Selection des joueur--------------------
			boolean jeuValide = false;
			while (!(jeuValide)){
				System.out.println("Le combat seras entre qui et qui? (Ordinateur/Joueur) = O/J par exemple");
				String vs = sc.nextLine();
				switch (vs){
					case "J/J" :
						System.out.println("");
						j1 = new Joueur(true);
						System.out.println("");
						j2 = new Joueur(false);
						System.out.println("");
						jeuValide = true;
						break;

					case "J/O" :
						System.out.println("");
						j1 = new Joueur(true);
						System.out.println("");
						j2 = new Ordinateur(false, nbColonne);
						System.out.println("");
						jeuValide = true;
						break;

					case "O/J" :
						System.out.println("");
						j1 = new Ordinateur(true, nbColonne);
						System.out.println("");
						j2 = new Joueur(false);
						System.out.println("");
						jeuValide = true;
						break;

					case "O/O" :
						System.out.println("");
						j1 = new Ordinateur(true, nbColonne);
						System.out.println("");
						j2 = new Ordinateur(false, nbColonne);
						System.out.println("");
						jeuValide = true;
						break;

					default :
						break;
				}
			}
//-------------------------------La boucle du jeu---------------------------
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
//--------------------------------------------------------------------------
		  catch(IndexOutOfBoundsException e){
			System.out.println("Colonne inexistante");
		} catch(InputMismatchException ee){
			System.out.println("Ce n'est pas un nombre");
		} catch(NullPointerException np){
			System.out.println("Ce n'est pourtant pas compliquer de repondre oui ou non");
		}
	}
}
