/**
 * class qui permet de d�finir une Exception
 */
public class JetonInvalide extends Exception{

	/**
	 * contructeur vide de JetonInvalid
	 */
	public JetonInvalide(){
		super();
	}

	/**
	 * cdeuxieme constructeur de JetonInvalid
	 * @param message
	 */
	public JetonInvalide(String message){
		super(message);
	}
}
