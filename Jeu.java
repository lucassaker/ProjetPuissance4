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
			System.out.print("Voulez vous une grille par defaut ? (oui/non) : ");
			String choix = sc.nextLine();
			System.out.println("");
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
			System.out.println("Le combat seras entre qui et qui? (Ordinateur/Joueur) = O/J par exemple");
			while (!(jeuValide)){
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
						System.out.println("Regardez l'exemple");
						break;
				}
			}
//-------------------------------La boucle du jeu---------------------------

			boolean fini = false;
			int res = 1;
			System.out.println("\n\n");
			while(!(fini)) {
				System.out.println("\n\n");
				g.afficher();
				g.ajouterJeton(j1.getJeton(), j1.jouer());
				System.out.println("");
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

	public final static void clearConsole(){
		for (int i = 0; i<50; i++){
			System.out.println("");
		}
	}
}
