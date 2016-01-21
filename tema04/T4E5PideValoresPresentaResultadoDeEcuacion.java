/**
 * Realiza un programa que resuelva una ecuación de primer grado
 *(del tipo ax + b = 0).
 *
 * @author David Bernal Guerrero
 */

  public class T4E5PideValoresPresentaResultadoDeEcuacion {
    public static void main(String[] args) {

      System.out.print("Siendo la ecuación (ax + b = 0)\nPor favor, introduzca "
        + "el valor de a: ");
      double valorA = Double.parseDouble( System.console().readLine());

      System.out.print("Por favor, introduzca el valor de b: ");
      double valorB = Double.parseDouble( System.console().readLine());

      double valorX = -valorB/valorA;

      if (valorA == 0) {
        System.out.print("\nEl valor de X es INFINITO y por tanto no tiene " +
        "solución exacta.");
      } else {
        System.out.print("\nEl valor de X es: " + valorX);
      }
    }
  }
