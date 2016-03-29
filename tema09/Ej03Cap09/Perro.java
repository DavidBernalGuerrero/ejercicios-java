
package Ej03Cap09;

public class Perro extends Mamifero{
  
  private String raza;
  
  public Perro (String edad, String sexo, String gestacion, String raza){
    super(edad, sexo, gestacion);
    this.raza = raza;
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

  public String getGestacion() {
    return gestacion;
  }

  public void setGestacion(String gestacion) {
    this.gestacion = gestacion;
  }
  
  void ladra () {
    System.out.println("Guau");
  }
  
  void aulla () {
    System.out.println("Auuuuuu");
  }
  
  void persigueCola () {
    System.out.println("¡Eh, ¿que ese eso que tengo ahí detrás?!");
  } 
}
