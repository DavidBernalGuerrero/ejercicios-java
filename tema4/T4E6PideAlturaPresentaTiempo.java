/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 *una altura h. Aplica la fórmula t = √2h/g siendo g = 9.81m/s²
 *
 * @author David Bernal Guerrero
 */

  public class T4E6PideAlturaPresentaTiempo {
    public static void main(String[] args) {

      System.out.print("Siendo la ecuación (t = √2h/g)\nPor favor, introduzca "
        + "el valor de la altura (h): ");
      double valorH = Double.parseDouble( System.console().readLine());

      double valorT = Math.sqrt(2*valorH/9.81);

      if (valorH < 0) {
        System.out.print("El valor de t no puede ser menor a 0.");
      } else {
        System.out.printf("\nEl valor de t es: %.3fs².", valorT);
      }
    }
  }
