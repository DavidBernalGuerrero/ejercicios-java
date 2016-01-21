/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el
 *correspondiente nombre del día de la semana.
 *
 * @author David Bernal Guerrero
 */

  public class T4E3PideNumero1a7PresentaDiaSemana {
    public static void main(String[] args) {

      System.out.print("Por favor, introduzca un número del 1 al 7 y le " +
        "diré a que día de la semana pertenece: ");
      int dia = Integer.parseInt( System.console().readLine());

      String diaSemana = "";

      switch (dia) {

        case 1:
          diaSemana = "Lunes";
          break;
        case 2:
          diaSemana = "Martes";
          break;
        case 3:
          diaSemana = "Miercoles";
          break;
        case 4:
          diaSemana = "Jueves";
          break;
        case 5:
          diaSemana = "Viernes";
          break;
        case 6:
          diaSemana = "Sabado";
          break;
        case 7:
          diaSemana = "Domingo";
          break;

        default:
          diaSemana = "criticazo";        //comprobador de errores
      }
      if (diaSemana.equals("criticazo")) {
        System.out.print("El número introducido no es correcto");
      } else {
        System.out.printf("Hoy es ¡%s!", diaSemana);
      }
    }
  }
