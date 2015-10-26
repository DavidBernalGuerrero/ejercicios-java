/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author David Bernal Guerrero
 */

  public class T5E8PideNumeroPresentaTablaMultiplicar {
    public static void main(String[] args) {

      System.out.println("Por favor, introduzca el número del que desea " +
        "conocer la tabla: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());

      int multiplicador = 0;
      int resultado = 0;

      do { 

      resultado = numeroIntroducido * multiplicador;
      
      System.out.println(numeroIntroducido + " por " + multiplicador + " : "
        + resultado);
      
      multiplicador ++;
      
      } while (multiplicador <= 10);
    }
  }
