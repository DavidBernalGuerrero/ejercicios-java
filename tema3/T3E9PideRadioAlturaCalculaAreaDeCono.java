/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula
 *V = πr²h/3
 *
 * @author David Bernal Guerrero
 */

  public class T3E9PideRadioAlturaCalculaAreaDeCono {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca el radio del cono en "
      + "centímetros: ");
    double radio = Double.parseDouble( System.console().readLine());

    System.out.print("Por favor, introduzca la altura del cono en "
      + "centímetros: ");
    double altura = Double.parseDouble( System.console().readLine());    

    System.out.printf("\nEl area del cono, siendo su radio %.2fcm² y su altura "
      , radio);
    System.out.printf("%.2fcm², calcularemos el área del cono: %.2f", altura,
      ((3.141516*radio*radio*altura)/3));
      
    }
  }
