import java.io.*;
import java.util.*;

/**
 * class qui permet de définir un Jeton
 */
public class Jeton {
	private char forme;
	
	/**
	 * constructeur de Jeton
	 * @param c
	 * @throws IOException
	 */
	public Jeton(char c) throws IOException{ //catch incompatibleTypes
		this.forme = c;
	}

	/**
	 * constructeur vide de Jeton
	 */
	public Jeton(){
		this.forme = '.';
	}

	/**
	 * methode qui permet d'obtenir le caractere en guise de forme
	 * @return char qui est la forme du jeton
	 */
	public char getForme(){
		return this.forme;
	}
	
	/**
	 * methode qui permet de modifier la forme du caractere
	 * @param a
	 */
	public void modifForme(char a){
		this.forme = a;
	}
	
	/**
	 * methode qui permet d'annoncer la forme du jeton
	 * @return String qui est la forme du jeton entre deux espaces
	 */
	public String toString(){
		return (" " + this.getForme() + " ");
	}
}
