/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
 *2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author David Bernal Guerrero
 */

  public class T6E04Presenta20NumerosAleatoriosEntre0y10 {
    public static void main(String[] args) {

      int numero = 0;

      for (int contador = 0; contador < 20; contador++) {
        numero = (int)(Math.random() * 11);

        System.out.print(numero + " ");

      }
    }
  }
