
package ArrayPOOEj01Cap09;

public class Gato{
  
  private String nombre;
  private String edad;
  private String sexo;
  private String raza;
  private String gestacion;
  
  
  public Gato () {

  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEdad() {
    return edad;
  }

  public void setEdad(String edad) {
    this.edad = edad;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
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

  @Override
  public String toString() {
    return "\nNombre: " + this.nombre + "\nEdad: " + this.edad + "\nSexo: " 
        + this.sexo + "\nGestación: " + this.gestacion + "\nRaza: "
        + this.raza;
  }
  
  
}
