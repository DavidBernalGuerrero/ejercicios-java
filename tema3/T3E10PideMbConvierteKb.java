/**
 * Realiza un conversor de Mb a Kb.
 *
 * @author David Bernal Guerrero
 */

  public class T3E10PideMbConvierteKb {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca la cantidad de Megabytes que desea"
      + " convertir a Kilobytes: ");
    double megaByte = Double.parseDouble( System.console().readLine());

    System.out.printf("\nLa conversión de %.2fMb a Kilobytes es: %.2fKb.",
      megaByte, (megaByte*1024));
      
    }
  }
