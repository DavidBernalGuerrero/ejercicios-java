package Ej01Cap09;

public class PooJavaEj01Cap09 {
  
  public static void main(String[] args) {
    
    Caballo Jahson = new Caballo("frisón", "macho", "7");
    Jahson.relincha();
    
    Caballo Jacobina = new Caballo("percherón", "hembra", "9");
    Jacobina.come();
    
    Jahson.compiteCon(Jacobina);
  }
}
