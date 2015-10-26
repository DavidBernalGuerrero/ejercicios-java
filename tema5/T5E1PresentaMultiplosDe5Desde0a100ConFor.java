/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for .
 *
 * @author David Bernal Guerrero
 */

  public class T5E1PresentaMultiplosDe5Desde0a100ConFor {
    public static void main(String[] args) {

    int incremento = 1;
    
      for (int multiplos = 0; multiplos <= 100; multiplos = incremento++ * 5) { // MUESTRA SU INICIALIZACION, ES DECIR, EMPIEZA A CONTAR DESDE 0 YA QUE LEE LA PRIMERA EXPRESION

      System.out.println(multiplos);

      }
    }
  }
