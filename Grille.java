import java.util.*;
import java.io.*;

/**
 * class qu permet de d�finir le comportement de la Grille ah oui oui
 */
public class Grille{
	private ArrayList<Colonne> laGrille;

	/**
	 * constructeur de la Grille
	 * @param a
	 */
	public Grille(int res){
		if (res>0) this.laGrille = new ArrayList<Colonne>(a);
		else this.laGrille = new ArrayList<Colonne>(10);
		for(int i = 0; i<a; i++){
			this.laGrille.add(new Colonne());
		}
	}

	/**
	 * methode qui permet d'afficher la Grille
	 */
	public void afficher(){
		for (int i = this.laGrille.get(0).taille(); i>=-1; i--){
			System.out.print("|");
			for (int y = 0; y<this.laGrille.size(); y++){
				if ((i>=0 && i<this.laGrille.get(0).taille()) && (y>=0 && y<this.laGrille.size())){
					System.out.print(this.laGrille.get(y).getColonne().get(i).toString());
				}
				else if (i==this.laGrille.get(0).taille()) {
					System.out.print("---");
				}
				else if (i<0){
					System.out.print("---");
				}
			}
			System.out.println("|");

		}
	}

	/**
	 * methode qui permet d'ajouter un jeton a la Grille
	 * @param j
	 * @param posMalone
	 */
	public void ajouterJeton(Jeton j, int posMalone){
		boolean doitJeRajouterUneLigne = this.laGrille.get(posMalone-1).ajouterJeton(j);
		if (doitJeRajouterUneLigne == true){
			rajouterLigne();
		}
	}

	/**
	 * metohde qui permet d'ajouter une ligne a la Grille
	 */
	public void rajouterLigne(){
		for(int i = 0; i<this.laGrille.size(); i++){
			this.laGrille.get(i).getColonne().add(new Jeton());
		}
	}

	/**
	 * methode qui permet de retourner la Grille qui est une ArrayList
	 * @return la Grille
	 */
	public ArrayList<Colonne> getGrille(){
		return this.laGrille;
	}

}
