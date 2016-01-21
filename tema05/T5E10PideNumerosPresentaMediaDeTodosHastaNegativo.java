/**
 * Escribe un programa que calcule la media de un conjunto de números positivos 
 *introducidos por teclado. A priori, el programa no sabe cuántos números se 
 *introducirán. El usuario indicará que ha terminado de introducir los datos 
 *cuando meta un número negativo.
 *
 * @author David Bernal Guerrero
 */

  public class T5E10PideNumerosPresentaMediaDeTodosHastaNegativo {
    public static void main(String[] args) {

      System.out.println("Introduzca números para poder hacer la media de todos"
        + "ellos. Recuerda que deben ser números enteros. Utiliza un número " +
        "negativo para dejar de introducir números. \nPor favor, introduce el" +
        " primer número: "); 
      double numeroIntroducido = Double.parseDouble(System.console().readLine());

      int contador = 1;
      double media = 0;
      
      while (numeroIntroducido >= 0) {

        System.out.println("Introduzca un número: ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());

        if (numeroIntroducido >= 0) {         //Usado para excluir números negativos haciendo que salte 
                                              //así no se ven afectados ni el contador ni la media.
          media += numeroIntroducido;

          contador++;
        }
      } 
      
      System.out.println("La media de los números es: " + (media/contador));
      
    }
  }
