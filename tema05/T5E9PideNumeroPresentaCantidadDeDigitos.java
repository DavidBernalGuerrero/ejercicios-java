/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido 
 *por teclado.
 *
 * @author David Bernal Guerrero
 */

  public class T5E9PideNumeroPresentaCantidadDeDigitos {
    public static void main(String[] args) {

      System.out.println("Por favor, introduzca el número entero del que desea "
        +  "conocer su número de dígitos: ");
      long numeroIntroducido = Long.parseLong(System.console().readLine());

      int contador = 1;

      while (numeroIntroducido > 10) {
        
        numeroIntroducido = numeroIntroducido / 10;
        
        contador++ ;
        
      }
      
      System.out.println("El número introducido tiene " + contador + "cifras.");

    }
  }
