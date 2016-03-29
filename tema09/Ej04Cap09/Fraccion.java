
package Ej04Cap09;

public class Fraccion {
  
  private int numerador;
  private int denominador;
  
  private int aux;
  
  public Fraccion (int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  public double getNumerador() {
    return numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public double getDenominador() {
    return denominador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }
  
  public void invierte () {
    this.aux = this.denominador;
    this.denominador = this.numerador;
    this.numerador = this.aux;
  }
  
  public void simplifica () {
    while (((this.numerador % 2) == 0) && ((this.denominador % 2) == 0)){
      this.numerador /= 2;
      this.denominador /= 2;      
    }
  }
  
  public void multiplica (Fraccion fraccion) {
    this.numerador *= fraccion.getNumerador();
    this.denominador *= fraccion.getDenominador();
  }
  
  public void divide (Fraccion fraccion) {
    this.numerador *= fraccion.getDenominador();
    this.denominador *= fraccion.getNumerador();
  }

  @Override
  public String toString() {
    return this.getNumerador() + "\n====\n" + this.getDenominador();
  }
  
  
}
