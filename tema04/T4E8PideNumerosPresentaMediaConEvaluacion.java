/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 *suficiente, bien, notable o sobresaliente).
 *
 * @author David Bernal Guerrero
 */

  public class T4E8PideNumerosPresentaMediaConEvaluacion {
    public static void main(String[] args) {

      System.out.print("Vamos a realizar la media de tres números. Por favor " +
        "introduzca el primer número: ");
      double valor1 = Double.parseDouble( System.console().readLine());

      System.out.print("Por favor introduzca el segundo número: ");
      double valor2 = Double.parseDouble( System.console().readLine());

      System.out.print("Por favor introduzca el tercer número: ");
      double valor3 = Double.parseDouble( System.console().readLine());

      double resultado = (valor1 + valor2 + valor3)/3;

      if ((valor1 > 0) && (valor2 > 0) && (valor3 > 0)
        && (valor1 <= 10) && (valor2 <= 10) && (valor3 <= 10)) {
          System.out.println("La media de los tres números es: " + resultado);
          
          if ((resultado >= 0) && (resultado < 5)) {
            System.out.print("¡Lo sentimos! Lo sentimos la nota media en su boletín"
            + "es: Insuficiente ");
          }

          if ((resultado >= 5) && (resultado < 6)) {
            System.out.print("¡No esta mal! La nota media en su boletín es: " +
            "Suficiente");
          }

          if ((resultado >= 6) && (resultado < 7)) {
            System.out.print("¡Bien hecho! La nota media en su boletín es: " +
            "Bien");
          }

          if ((resultado >= 7) && (resultado < 9)) {
            System.out.print("¡Increible! La nota media en su boletín es: " +
            "Notable");
          }

          if (resultado >= 9 ) {
            System.out.print("¡Excelente! Enhorabuena la nota media en su " +
            "boletín es: Sobresaliente");
          }
      } else {
        System.out.print("Los valores introducidos no son correctos. Por favor "
        + "introduce números entre 0 y 10.");
      }
    }
  }
