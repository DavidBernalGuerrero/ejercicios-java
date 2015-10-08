/**
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author David Bernal Guerrero
 */

  public class T4E7PideNumerosPresentaMedia {
    public static void main(String[] args) {

      System.out.print("Vamos a realizar la media de tres números. Por favor " +
        "introduzca el primer número: ");
      double valor1 = Double.parseDouble( System.console().readLine());

      System.out.print("Por favor introduzca el segundo número: ");
      double valor2 = Double.parseDouble( System.console().readLine());

      System.out.print("Por favor introduzca el tercer número: ");
      double valor3 = Double.parseDouble( System.console().readLine());

      double resultado = (valor1 + valor2 + valor3)/3;

      if ((valor1 > 0) && (valor2 > 0) && (valor3 > 0)
        && (valor1 <= 10) && (valor2 <= 10) && (valor3 <= 10)) {
          System.out.print("La media de los tres números es: " + resultado);
      } else {
        System.out.print("Los valores introducidos no son correctos. Por favor "
        + "introduce números entre 0 y 10.");
      }
    }
  }
