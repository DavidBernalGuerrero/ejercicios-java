/**
 * Escribe un programa que dados dos números, uno real (base) y un entero 
 *positivo (exponente), saque por pantalla todas las potencias con base el 
 *numero dado y exponentes entre uno y el exponente introducido. No se deben 
 *utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 
 *5, se deberán mostrar 2E1 , 2E2 , 2E3 , 2E4 y 2E5 .
 *
 * @author David Bernal Guerrero
 */

  public class T5E15PideBaseExponentePresentaDesdeExponente0aIntroducido {
    public static void main(String[] args) {

      System.out.println("Introduzca la base: ");
      double base = Double.parseDouble(System.console().readLine());

      System.out.println("Introduzca el exponente (entero positivo): ");
      int exponente = Integer.parseInt(System.console().readLine());

      int contador = 1;

      while (contador <= exponente) {

        System.out.printf("%.2f Elevado a %d \n", base, contador);
        
        contador++;
      }
    }
  }
