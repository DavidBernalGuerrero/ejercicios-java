/**
 * Realiza un programa que pida dos números y que luego muestre el resultado de su
 *multiplicación.
 *
 * @author David Bernal
 */

public class T3E1PideNumMultiplicalos {
  public static void main(String[] args) {

    System.out.print("Por favor, introduce un número: ");
    double primerNumero = Integer.parseInt( System.console().readLine() );

    System.out.print("introduce otro, por favor: ");
    double segundoNumero = Integer.parseInt( System.console().readLine() );

    System.out.printf("El primer número introducido es %.2f y el segundo es %.2f\n", primerNumero, segundoNumero);
    System.out.print("El resultado de multiplicar el primer número");
    System.out.print("y el segundo es: " + (primerNumero*segundoNumero));
    
  } 
}
