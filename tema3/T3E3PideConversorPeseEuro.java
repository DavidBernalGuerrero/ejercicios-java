/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author David Bernal Guerrero
 */

  public class T3E3PideConversorPeseEuro {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca la cantidad de pesetas a"
      + " convertir: ");
    double pesetas = Double.parseDouble( System.console().readLine());

    System.out.printf("La conversión de %.2fptas a euros es: %.2f€", pesetas,
      (pesetas/166.386));
      
    }
  }
