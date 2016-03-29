
package Ej06Cap09;

public class Tiempo {
  
  private int horas;
  private int minutos;
  private int segundos;
  
  public Tiempo (int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  public int getSegundos() {
    return segundos;
  }

  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }
  
  public void suma (Tiempo tiempo) {
    // Suma cada valor de forma independiente
    this.segundos += tiempo.segundos;   
    this.minutos += tiempo.minutos;
    this.horas += tiempo.horas;
    
    convierteASegundos(tiempo);
    transformaAUnidad();
  }
  
  public void resta (Tiempo tiempo) {
    // Resta cada valor de forma independiente
    this.segundos -= tiempo.segundos;   
    this.minutos -= tiempo.minutos;
    this.horas -= tiempo.horas;
    
    convierteASegundos(tiempo);
    
    if (this.segundos < 0) {
      this.segundos = 0;
    }    
    
    transformaAUnidad();
  }  

  private void convierteASegundos (Tiempo tiempo) {
    // Conviertelos a segundos
    this.segundos += this.horas * 3600;
    this.segundos += this.minutos * 60;
  }
  
  private void transformaAUnidad () {
    this.minutos = this.segundos / 60;
    this.segundos = this.segundos % 60;
    
    this.horas = this.minutos / 60;
    this.minutos = this.minutos % 60;
  }
  
  @Override
  public String toString() {
    return this.horas + "h " + this.minutos + "m " + this.segundos + "s";
  }
}
