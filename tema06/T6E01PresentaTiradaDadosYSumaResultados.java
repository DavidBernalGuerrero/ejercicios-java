/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 *también la suma total (los puntos que suman entre los tres dados).
 *
 * @author David Bernal Guerrero
 */

  public class T6E01PresentaTiradaDadosYSumaResultados {
    public static void main(String[] args) {

      int tirada = 0;
      int SumaTiradas = 0;

      for (int numeroDados = 0 ; numeroDados < 3; numeroDados++) {

        tirada = (int)(Math.random()*6) + 1;
        System.out.println(tirada);

        SumaTiradas += tirada;

      }

      System.out.println("La suma total de sus dados es: " + SumaTiradas);

    }
  }
