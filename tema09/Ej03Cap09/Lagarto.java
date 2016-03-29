
package Ej03Cap09;

public class Lagarto extends Animal{
  
  private String raza;
  
  public Lagarto (String edad, String sexo, String gestacion, String raza){
    this.edad = edad;
    this.sexo = sexo;
    this.gestacion = gestacion;
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
  
  void huele () {
    System.out.println("Sshh");
  }
  
  void detecta () {
    System.out.println("¡Se acerca alguien, yo me voy de aquí!");
  }
  
  void tomaElSol () {
    System.out.println("¡Que agustito estoy en esta piedra!");
  }
  
}
