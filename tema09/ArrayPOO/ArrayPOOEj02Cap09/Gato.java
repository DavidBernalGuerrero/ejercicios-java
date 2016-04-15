
package ArrayPOOEj02Cap09;

public class Gato extends Mamifero{
  
  private String raza;
  private String nombre;
  
  public Gato (String nombre, String edad, String sexo, String gestacion, String raza){
    super(edad, sexo, gestacion);
    this.raza = raza;
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
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

  @Override
  public String toString() {
    return "\nNombre: " + this.nombre + "\nEdad: " + super.getEdad() + "\nSexo: " 
        + super.getSexo() + "\nGestación: " + super.getGestacion() + "\nRaza: "
        + this.raza;
  }
  
  
}
