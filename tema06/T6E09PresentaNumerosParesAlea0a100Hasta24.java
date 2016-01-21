/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
 *termine de generar números hasta que no saque el 24. El programa deberá decir al final
 *cuántos números se han generado.
 *
 * @author David Bernal Guerrero
 **/

  public class T6E09PresentaNumerosParesAlea0a100Hasta24 {
    public static void main(String[] args) {

      boolean numeroClave = false;
      int numeroAleatorio = 0;
      int contadorNumeros = 0;

      while (!numeroClave) {
        numeroAleatorio = (int)(Math.random() * 101);
        
        if (numeroAleatorio % 2 == 0) {
          System.out.print(numeroAleatorio + " ");
          contadorNumeros++;
        }

        if (numeroAleatorio == 24) {
          numeroClave = true;
        } // cierre del 24
      } // for general
      
      System.out.println("\nSe han generado: " + contadorNumeros + " números.");
    }
  }
