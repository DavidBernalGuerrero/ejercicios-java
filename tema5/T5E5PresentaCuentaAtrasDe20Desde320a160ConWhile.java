/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás 
 *utilizando un bucle while.
 *
 * @author David Bernal Guerrero
 */

  public class T5E5PresentaCuentaAtrasDe20Desde320a160ConWhile {
    public static void main(String[] args) {

      int resultado = 320;

      while (resultado >= 160) { 

      System.out.println(resultado);
      
      resultado -= 20;

      }
    }
  }
