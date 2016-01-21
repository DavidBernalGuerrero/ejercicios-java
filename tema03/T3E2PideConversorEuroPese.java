/**
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 *convertir deberá estar almacenada en una variable.
 *
 * @author David Bernal Guerrero
 */

  public class T3E2PideConversorEuroPese {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca la cantidad de euros a convertir:");
    double euro = Double.parseDouble( System.console().readLine());

    //double pesetas = euro*166.386/1;                  CODIGO NO NECESARIO
    System.out.printf("La conversión de %.2f€ a pesetas es: %fptas", euro,
      (euro*166.386));
      
    }
  }
