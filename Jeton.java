import java.io.*;
import java.util.*;

public class Jeton {
  private char forme;

  public Jeton(char c) throws IOException{ //catch incompatibleTypes
    this.forme = c;
  }

  public Jeton(){
    this.forme = '.';
  }

  public char getForme(){
    return this.forme;
  }
  public void modifForme(char a){
    this.forme = a;
  }
  public String toString(){
    return (" " + this.getForme() + " ");
  }
}
