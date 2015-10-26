/**
 * Escribe un programa que lea una lista de diez números y determine cuántos 
 *son positivos, y cuántos son negativos.
 *
 * @author David Bernal Guerrero
 */

  public class T5E13Pide10NumerosPresentaCantidadPositivosNegativos {
    public static void main(String[] args) {

      int contador = 0;
      int numeroPositivo = 0;
      int numeroNegativo = 0;
      int numeroIntroducido = 0;
      
      do {

        System.out.println("Introduzca un número entero positivo o negativo: ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());

        if (numeroIntroducido >= 0) {
        
          numeroPositivo++;
        
        } else {
        
          numeroNegativo++;
        
        }
        
        contador++;

      } while (contador < 10);

      System.out.println("Numeros positivos: " + numeroPositivo);
      System.out.println("Numeros negativos: " + numeroNegativo);

    }
  }
