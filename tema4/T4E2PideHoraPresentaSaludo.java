/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 *días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 *6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 *horas, los minutos no se deben introducir por teclado.
 *
 * @author David Bernal Guerrero
 */

  public class T4E2PideHoraPresentaSaludo {
    public static void main(String[] args) {

      System.out.println("Por favor, ¿podría decirme que hora en este momento? " +
        "(Utilice el formato horario 0-23): ");
      int hora = Integer.parseInt( System.console().readLine());

      if ((hora >= 0) && (hora < 24)) {
        if ((hora >= 6) && (hora <= 12)) {
          System.out.print("¡Buenos días!");
        } else {
          if ((hora >= 13) && (hora <= 20)) {
            System.out.print("¡Buenas tardes!");
          } else {
            System.out.print("¡Buenas noches!");
          }
        }
      } else {
        System.out.print("La hora introducida no es correcta.");
      }
    }
  }
