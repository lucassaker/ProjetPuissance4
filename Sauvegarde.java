import java.io.*;

/**
 * Class permettant de sauvegarder un objet
 */
public class Sauvegarde {

	private Jeu jeu;
	private String nomFichier;

	/**
	 * Constructeur d'une sauvegarde
	 * @param p_joueur joueur a sauvegarder
	 * @param p_nomFichier nom du fichier dans lequel on sauvegarde
	 */
	public Sauvegarde(Jeu p_jeu, String p_nomFichier) {
		this.jeu = p_jeu;
		this.nomFichier = p_nomFichier;
	}

	/**
	 * Methode permettant de sauvegarder un objet
	 */
	public void sauve() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFichier));
			oos.writeObject(jeu);
			oos.close();
		} catch (IOException e) {
			System.out.println("erreur d�E/S");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("erreur hors E/S");
			e.printStackTrace();
		}
	}

	/**
	 * Methode permettant de charger un objet
	 */
	public void charge() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFichier));
			jeu = (Jeu)(ois.readObject());
			ois.close();
		} catch (IOException e) {
			System.out.println("erreur d�E/S");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("erreur hors E/S");
			e.printStackTrace();
		}
	}
}
