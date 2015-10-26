/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 *primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 *unidad.
 *
 * @author David Bernal Guerrero
 */

  public class T5E16PideNumeroPresentaPrimoONO {
    public static void main(String[] args) {

      System.out.print("Por favor, introduzca un número: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      int contador = 2;
      int primo = 1;
      
      while ((contador < numeroIntroducido) && (primo != 0)) {          //Hacerlo con un while evita el caso del número 2%2
        primo = numeroIntroducido % contador;
        contador++;
        //System.out.println(primo);                          Comprobador de primos
      }
      
      if (primo == 0) {
      
        System.out.println("El número introducido no es primo.");

      } else {

        System.out.println("El número introducido si es primo.");

      }
    }
  }
