import java.util.*;
import java.io.*;

/**
 * class qui permet de définir le comportement d'une Colonne
 */
public class Colonne{
	private ArrayList<Jeton> lesJetons;

	/**
	 * constructeur de la Colonne
	 * @param a
	 */
	public Colonne(int a){
		if (a>=0) this.lesJetons = new ArrayList<Jeton>(a);
		else this.lesJetons = new ArrayList<Jeton>(0);
		remplirColonne();
	}

	/**
	 * constructeur vide de la Colonne
	 */
	public Colonne(){
		this.lesJetons = new ArrayList<Jeton>(0);
		for (int i = 0; i<1; i++){
			this.lesJetons.add(new Jeton());
		}
	}

	/**
	 * methode qui permet de remplir la Colonne
	 */
	public void remplirColonne(){
		for (int i = 0; i<this.lesJetons.size(); i++){
			this.lesJetons.add(new Jeton());
		}
	}

	/**
	 * methode qui permet d'ajouter un jeton a la Colonne
	 * @param j
	 * @return boolean si ajouté ou non
	 */
	public boolean ajouterJeton(Jeton j){
		int i = 0;
		while (this.lesJetons.get(i).getForme() != '.'){
			i++;
		}
		this.lesJetons.get(i).modifForme(j.getForme());
		boolean res = true;
		if (i != this.lesJetons.size()-1){
			res = false;
		}
		return res;
	}

	public int taille(){
		return this.lesJetons.size();
	}

	public void removeEnHaut(){
		this.lesJetons.remove(this.lesJetons.size());
	}

	public ArrayList<Jeton> getColonne(){
		return this.lesJetons;
	}

}
