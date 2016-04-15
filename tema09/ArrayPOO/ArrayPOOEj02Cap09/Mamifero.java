
package ArrayPOOEj02Cap09;

/**
 *
 * @author Administrador
 */
public class Mamifero extends Animal {
  
  public Mamifero (String edad, String sexo, String gestacion) {
    this.edad = edad;
    this.sexo = sexo;
    this.gestacion = gestacion;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getEdad() {
    return edad;
  }

  public void setEdad(String edad) {
    this.edad = edad;
  }

  public String getGestacion() {
    return gestacion;
  }

  public void setGestacion(String gestacion) {
    this.gestacion = gestacion;
  }
  
  void corre() {
    System.out.println("1,2,3...1,2,3...");
  }
  
  void creaMadriguera() {
    System.out.println("Esta será mi futura casa.");
  }
  
  void lame () {
    System.out.println("Tengo que asear a mis crias.");
  }
}
