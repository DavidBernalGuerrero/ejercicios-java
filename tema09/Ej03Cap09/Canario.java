
package Ej03Cap09;

public class Canario extends Ave{
  
  private String raza;
  
  public Canario (String edad, String sexo, String gestacion, String raza){
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
  
  void pia () {
    System.out.println("Pio");
  }
  
  void canta () {
    System.out.println("¡Pio, pio, pio,...!");
  }
  
  void revolotea () {
    System.out.println("¡Una voltereta más, y ahora un giro a la derecha!");
  }
}
