
package Ej03Cap09;

public class Gato extends Mamifero{
  
  private String raza;
  
  public Gato (String edad, String sexo, String gestacion, String raza){
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
  
  void ronronea () {
    System.out.println("Grrrr");
  }
  
  void maulla () {
    System.out.println("Miauuuuu");
  }
  
  void afilaGarras () {
    System.out.println("¡Ese sofá es perfecto para afilar mis garras!");
  }
}
