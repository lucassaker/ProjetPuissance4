public class Jeton {
  private char forme;

  public Jeton(char c) throws JetonInvalide{ //catch incompatibleTypes
    try{
      if (c instanceof char[]) this.forme = c; else throw new JetonInvalide();
    }
    catch (JetonInvalide jt){
      System.out.println("Le jeton saisie \u00e0 besoin d'un caractère");
    }
  }

  public char getForme(){
    return this.forme;
  }
  public void modifForme(char a){
    this.forme = a;
  }

}
