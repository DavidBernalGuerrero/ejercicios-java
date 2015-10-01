/**
 * Escribe un programa que calcule el área de un triángulo.
 *
 * @author David Bernal Guerrero
 */

  public class T3E6PideCalculaAreaTriangulo {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca la base del triángulo en "
      + "centímetros: ");
    double base = Double.parseDouble( System.console().readLine());

    System.out.print("Por favor, introduzca la altura del triángulo en "
      + "centímetros: ");
    double altura = Double.parseDouble( System.console().readLine());    

    System.out.println("\nSiendo la base del triángulo: " + base +
      ". Y su altura: " + altura + "\nCalcularemos el área del triángulo...\n");

    System.out.printf("El área del triángulo será: %.2fcm².", (base*altura/2));
      
    }
  }
