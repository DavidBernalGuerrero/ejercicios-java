/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while .
 *
 * @author David Bernal Guerrero
 */

  public class T5E2PresentaMultiplosDe5Desde0a100ConWhile {
    public static void main(String[] args) {

    int incremento = 0;
    int multiplos = 0;
    
      while (multiplos < 100) {

      multiplos = incremento++ * 5;
      System.out.println(multiplos);

      }
    }
  }
