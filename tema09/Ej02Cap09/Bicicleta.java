
package Ej02Cap09;

public class Bicicleta extends Vehiculo {
  
  private int kilometrosRecorridos;
  
  public Bicicleta () {
    kilometrosRecorridos = 0;
  }
  
  void setKilometrosRecorridos (int m) {
    Vehiculo.kilometrosTotales += m;
    kilometrosRecorridos += m;
  }
  
  int getKilometrosRecorridos () {
    return kilometrosRecorridos;
  }
  
  void recorre(int distancia) {
    setKilometrosRecorridos(distancia);
  }
}
