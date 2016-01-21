/**
 * Realiza un conversor de Kb a Mb.
 *
 * @author David Bernal Guerrero
 */

  public class T3E11PideKbConvierteMb {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca la cantidad de Kilobytes que desea"
      + " convertir a Megabytes: ");
    double kiloByte = Double.parseDouble( System.console().readLine());

    System.out.printf("\nLa conversión de %.2fKb a Megabytes es: %.2fMb.",
      kiloByte, (kiloByte/1024));
      
    }
  }
