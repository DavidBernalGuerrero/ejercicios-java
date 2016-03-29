
package Ej03Cap09;

public class Pinguino extends Ave{
  
  private String raza;
  
  public Pinguino (String edad, String sexo, String gestacion, String raza){
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
  
  @Override
  void vuela () {
    System.out.println("Yo no puedo volar.");
  }
  
  @Override
  void aterriza () {
    System.out.println("Si no puedo volar, mucho menos aterrizar.");
  }
  
  void deslizate () {
    System.out.println("Fiuuuuuuum! Mira como bajo ésta pendiente.");
  }
  
  void aletea () {
    System.out.println("¡Un aplauso fuerte!");
  }
  
  void baila () {
    System.out.println("¡Eh, mira los pasos que me acabo de inventar.!");
  }
}
