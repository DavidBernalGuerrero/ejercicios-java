
package Ej02Cap09;

public class Coche extends Vehiculo {
  
  private int kilometrosRecorridos;
  
  public Coche () {
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
