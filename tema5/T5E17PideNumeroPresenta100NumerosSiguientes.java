/**
 * Realiza un programa que sume los 100 números siguientes a un número entero y
 *positivo introducido por teclado. Se debe comprobar que el dato introducido es
 *correcto (que es un número positivo).
 *
 * @author David Bernal Guerrero
 */

  public class T5E17PideNumeroPresenta100NumerosSiguientes {
    public static void main(String[] args) {

      System.out.print("Por favor, introduzca un número entero positivo: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());

      int contador = 0;
      
      do  {
        numeroIntroducido++;
        contador++;
        System.out.println(numeroIntroducido);
      } while (contador < 100);
    }
  }
