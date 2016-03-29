
package Ej03Cap09;

public class Ave extends Animal{
  
  public Ave (String edad, String sexo, String gestacion) {
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
  
  void vuela() {
    System.out.println("¡Vuelo por encima de las nubes!");
  }
  
  void aterriza() {
    System.out.println("He encontrado un sitio donde aterrizar,¡allá voy!");
  }
  
  void emigra(){
    System.out.println("¿Dónde podría ir esta vez de vacaciones?");
  }
}
