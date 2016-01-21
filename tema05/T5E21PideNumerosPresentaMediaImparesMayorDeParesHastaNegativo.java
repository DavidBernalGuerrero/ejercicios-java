/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos 
 *diga cuantos números se han introducido, la media de los impares y el mayor de los pares. El 
 *número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se 
 *incluye en el cómputo.
 *
 * @author David Bernal Guerrero
 */

  public class T5E21PideNumerosPresentaMediaImparesMayorDeParesHastaNegativo {
    public static void main(String[] args) {

      double numeroIntroducido = 0;
      double mediaImpares = 0;
      double numeroParMayor = 0;
      int contadorImpares = 0;
      int contadorNumeros = 0;
      
      while (numeroIntroducido >= 0) {

        System.out.println("Introduzca un número: ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());

        if (numeroIntroducido >= 0) {          
          
          if (numeroIntroducido % 2 != 0) {
            mediaImpares +=numeroIntroducido;
            contadorImpares++;
          } // MEDIA IMPARES

          if ((numeroIntroducido % 2 == 0) && (numeroIntroducido > numeroParMayor)) {
            numeroParMayor = numeroIntroducido;
          }
          contadorNumeros++;
        } //if de filtrado del numero negativo de cierre
      } // cierre del while
      
      System.out.println("Ha introducido: " + contadorNumeros + " números.");
      System.out.println("El mayor de todos los pares es: " + numeroParMayor);
      System.out.println("La media de los números impares introducidos es: " + (mediaImpares/contadorImpares));
      
    }
  }
