/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
 *partidos y el pleno al quince (15 filas).
 *
 * @author David Bernal Guerrero
 **/

  public class T6E07PresentaQuiniela {
    public static void main(String[] args) {

      int apuesta = 0;
      int tirada = 0;

      for (tirada = 1; tirada <= 15; tirada++) {
        apuesta = (int)(Math.random() * 3) + 1;
        
        System.out.print(tirada + ". ");
        
        switch (apuesta) {
        
        case 1:
          System.out.println("[ 1 |   |   ]");
          break;
        case 2:
          System.out.println("[   | X |   ]");
          break;
        case 3:
          System.out.println("[   |   | 2 ]");
          break;
        default:
          break;
        }
        if (tirada == 14) {
          System.out.println("\nPLENO AL 15");
        }
      }
    }
  }
