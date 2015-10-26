/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que 
 *calcule la potencia.
 *
 * @author David Bernal Guerrero
 */

  public class T5E14PideBaseExponentePresentaResultado {
    public static void main(String[] args) {

      System.out.println("Introduzca la base: ");
      double base = Double.parseDouble(System.console().readLine());

      System.out.println("Introduzca el exponente (entero positivo): ");
      int exponente = Integer.parseInt(System.console().readLine());

      double resultado = 1;

      for (int contador = 0; contador < exponente; contador++) {

        resultado = resultado * base;

      }

      System.out.println("El resultado de la operación será: " + resultado);

    }
  }
