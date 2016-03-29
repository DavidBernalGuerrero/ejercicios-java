
package Ej05Cap09;

public class Pizza {
 
  private String tipo;
  private String tamaño;
  private String estado;
  private static int TotalPedidas;
  private static int TotalServidas;
  
  public Pizza (String tipo, String tamaño) {
    this.tipo = tipo;
    this.tamaño = tamaño;
    this.estado = "pedida";
    this.TotalPedidas++;
  }

  public static int getTotalPedidas() {
    return TotalPedidas;
  }

  public static int getTotalServidas() {
    return TotalServidas;
  }
  
  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      this.TotalServidas++;
    } else {
      System.out.println("esa pizza ya se ha servido");
    }
  }

  @Override
  public String toString() {
    return "pizza " + this.tipo + " " + this.tamaño + ", " + this.estado;
  }
  
  
}
