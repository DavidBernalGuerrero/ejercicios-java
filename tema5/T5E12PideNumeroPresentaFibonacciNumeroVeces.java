/**
 * Escribe un programa que muestre los n primeros términos de la serie de 
 *Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y 
 *el resto se calcula sumando los dos anteriores, por lo que tendríamos que los 
 *términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se 
 *debe introducir por teclado.
 *
 * @author David Bernal Guerrero
 */

  public class T5E12PideNumeroPresentaFibonacciNumeroVeces {
    public static void main(String[] args) {

      System.out.println("Introduzca un número entero: ");
      int limite = Integer.parseInt(System.console().readLine());

      int contador = 0;
      int fibonacciA = 0;
      int fibonacciB = 1;
      int fibonacciResultado = 0;

      do {

        System.out.print(fibonacciResultado + ", ");

        fibonacciResultado = fibonacciA + fibonacciB;

        fibonacciA = fibonacciB;
        fibonacciB = fibonacciResultado;

        contador++;

        if (contador == 1) {       //Arranque del programa es diferente al resto

          fibonacciA = 0;

          contador++;

        }

      } while (contador <= limite);
    }
  }
