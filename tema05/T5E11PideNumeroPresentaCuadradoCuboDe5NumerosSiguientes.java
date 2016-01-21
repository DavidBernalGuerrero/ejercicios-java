/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de 
 *los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * @author David Bernal Guerrero
 */

  public class T5E11PideNumeroPresentaCuadradoCuboDe5NumerosSiguientes {
    public static void main(String[] args) {

      System.out.println("Introduzca un número: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());

      int contador = 0;

      System.out.println("Número\t\tCuadrado\tCubo");
      
      do {

        System.out.printf("%d\t\t%d\t\t%d\n", numeroIntroducido,      //numero
          (int)Math.pow(numeroIntroducido, 2),                  //cuadrado
          (int)Math.pow(numeroIntroducido, 3));                 //cubo
        
        numeroIntroducido++;
        contador++;
      
      } while (contador <= 4);
      
    }
  }
