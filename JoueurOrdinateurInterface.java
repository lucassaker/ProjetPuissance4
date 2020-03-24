/**
 * interface qui permet de d�finir un comportement soit Joueur soit Ordinateur
 * @author lucas saker
 *
 */
public interface JoueurOrdinateurInterface{

	/**
	 * methode qui d'annoncer que c'est a lui de jouer
	 * @return int
	 */
	abstract int jouer();

	/**
	 * methode qui permet d'annoncer qu'il a gagn� la partie
	 */
	abstract void gagner();
	
	/**
	 * methode qui permet de retourner un jeton
	 * @return jeton
	 */
	abstract Jeton getJeton();
}
