/**
 * Escribe un programa que calcule el área de un rectángulo.
 *
 * @author David Bernal Guerrero
 */

  public class T3E5PideCalculaAreaRectangulo {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca la base del rectángulo en "
      + "centímetros: ");
    double base = Double.parseDouble( System.console().readLine());

    System.out.print("Por favor, introduzca la altura del rectángulo en "
      + "centímetros: ");
    double altura = Double.parseDouble( System.console().readLine());    

    System.out.println("\nSiendo la base del rectángulo: " + base +
      ". Y su altura: " + altura + "\nCalcularemos el área del rectángulo...\n");

    System.out.printf("El área del rectángulo será: %.2fcm².", (base*altura));
      
    }
  }
