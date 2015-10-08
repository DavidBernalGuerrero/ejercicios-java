/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 *las horas extras. Escribe un programa que calcule el salario semanal de un
 *trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 *trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 *euros la hora.
 *
 * @author David Bernal Guerrero
 */

  public class T4E4PideHorasPresentaSalario {
    public static void main(String[] args) {

      System.out.print("Por favor, introduzca el número de horas que ha " +
        "trabajado esta semana: ");
      int horas = Integer.parseInt( System.console().readLine());

      int total = 0;
      //int horasExtra = 0;                                   INNECESARIO
      //int horasOrdinarias = 0;                              INNECESARIO
      
      if (horas <= 40) {
        total = horas * 12;
      } else {
        //horasOrdinarias = horas + 40 * 5;                   INNECESARIO
        //horasExtra = horas/40*5;                            INNECESARIO
        //total = horasOrdinarias + horasExtra                INNECESARIO
        total = (40 * 12) + (horas - 40) * 16;
      }

      System.out.printf("Su salario de esta semana asciende a: %d€.", total);

    }
  }
