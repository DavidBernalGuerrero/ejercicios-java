/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 *asignatura toca a primera hora ese día.
 *
 * @author David Bernal Guerrero
 */

  public class T4E1PideDiaPresentaPrimeraAsignatura {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca el día de la semana: ");
          //System.out.print("Por favor, introduzca el día de la semana en " +
          //  "minúsculas y sin acentuaciones: ");
    String diaSemana = System.console().readLine().toLowerCase();

    switch (diaSemana) {

      case "lunes":
        System.out.print("Los " + diaSemana + " tienes FOL a primera hora.");
        break;

      case "martes":
      case "jueves":
        System.out.print("Los " + diaSemana + " tienes PROG a primera hora.");
        
        break;

      case "miercoles":
        System.out.print("Los " + diaSemana + " tienes SIN a primera hora.");
        break;

      case "viernes":
        System.out.print("Los " + diaSemana + " tienes BBDD a primera hora.");
        break;

      case "sabado":
      case "domingo":
        System.out.print("¡Los fines de semana no hay clase!");
        break;
        
      default:
        System.out.print("El día de la semana introducido no es correcto.");
      }
    }
  }
