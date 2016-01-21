/**
 * Realiza un programa que resuelva una ecuación de segundo grado
 *(del tipo ax² + bx + c = 0).
 *
 * @author David Bernal Guerrero
 */

  public class T4E9PideNumerosPresentaResultadoEcuacion {
    public static void main(String[] args) {

      System.out.print("Vamos a resolver la siguiente ecuación " +
        "(ax² + bx + c = 0). \nPor favor introduzca valor de a: ");
      double valorA = Double.parseDouble( System.console().readLine());

      System.out.print("Por favor introduzca el valor de b: ");
      double valorB = Double.parseDouble( System.console().readLine());

      System.out.print("Por favor introduzca el valor de c: ");
      double valorC = Double.parseDouble( System.console().readLine());

      double discriminante = (valorB * valorB) - 4 * valorA * valorC;

      if (discriminante >= 0) {
        if (valorA != 0) {
          double resultadoXpositivo = (- valorB + (Math.sqrt((valorB *
            valorB) - 4 * valorA * valorC))) / (2 * valorA);
          double resultadoXnegativo = (- valorB - (Math.sqrt((valorB *
            valorB) - 4 * valorA * valorC))) / (2 * valorA);

          System.out.print("Valor x positivo: " + resultadoXpositivo + " y " +
            "valor x negativo: " + resultadoXnegativo);
        } else {
          System.out.print("Piensa que el valor de \"a\" no puede ser " +
            "negativo.");
        }
      } else {
        System.out.print("No tiene solucion o el número resultante es irreal.");
      }
    }
  }
