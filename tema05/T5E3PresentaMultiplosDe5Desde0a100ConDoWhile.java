/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 *
 * @author David Bernal Guerrero
 */

  public class T5E3PresentaMultiplosDe5Desde0a100ConDoWhile {
    public static void main(String[] args) {

    int incremento = 0;
    int multiplos = 0;
    
      do {

      multiplos = incremento++ * 5;
      System.out.println(multiplos);

      } while (multiplos < 100);
    }
  }
