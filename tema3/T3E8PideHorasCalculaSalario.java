/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 *las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author David Bernal Guerrero
 */

  public class T3E8PideHorasCalculaSalario {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca el número horas completas que ha "
     +"trabajado esta semana siendo su salario laboral a 12€/hora: ");
    double horas = Double.parseDouble( System.console().readLine());

    System.out.printf("\nSu salario de esta semana es: %.2f€", (horas*12));
      
    }
  }
