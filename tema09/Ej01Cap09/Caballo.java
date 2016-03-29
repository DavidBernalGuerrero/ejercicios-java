
package Ej01Cap09;

/**
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando instancias yaplicándole algunos métodos.
 *
 * @author David Bernal Guerrero
 */
public class Caballo {

  private String raza;
  private String sexo;
  private String edad;
  private String logros;
  
  
  public Caballo (String raza, String sexo, String edad) {
    this.raza = raza;
    this.sexo = sexo;
    this.edad = edad;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
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

  public String getLogros() {
    return logros;
  }

  public void setLogros(String logros) {
    this.logros = logros;
  }
  
  void relincha () {
    System.out.println("¡Hiiiiii!");
  }
  
  void compiteCon (Caballo caballo) {
    System.out.println("Te voy a vencer."); // caballo.getClass().getSimpleName() ); ??
  }
  
  void come () {
    System.out.println("Ñam, ñam, ¡Delicioso!");
  }
  
  
  
}
