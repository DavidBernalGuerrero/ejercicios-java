
package ArrayPOOEj01Cap09;

public abstract class Animal {
  
  public String sexo;
  public String edad;
  public String gestacion;
  
  void come () {
    System.out.println("Ñam Ñam, ¡Delicioso!");
  }
  
  void duerme () {
    System.out.println("Zzzz.");
  }
  
  void muevete () {
    System.out.println("Creo que iré a dar una vuelta.");
  }
}
