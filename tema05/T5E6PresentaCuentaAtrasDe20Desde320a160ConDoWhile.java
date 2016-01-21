/**
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un 
 *bucle do-while .
 *
 * @author David Bernal Guerrero
 */

  public class T5E6PresentaCuentaAtrasDe20Desde320a160ConDoWhile {
    public static void main(String[] args) {

      int resultado = 320;

      do { 

      System.out.println(resultado);
      
      resultado -= 20;
      
      } while (resultado >= 160);
    }
  }

