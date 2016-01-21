/**
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la
 *probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2
 *= 3/6 y 1/3 = 2/6.
 *
 * @author David Bernal Guerrero
 **/

  public class T6E08PresentaQuinielaAmañada {
    public static void main(String[] args) {

      int apuesta = 0;
      int tirada = 0;

      for (tirada = 1; tirada <= 15; tirada++) {
        apuesta = (int)(Math.random() * 6) + 1;
        
        System.out.print(tirada + ". ");
        
        switch (apuesta) {
        
        case 1:
        case 2:
        case 3:
          System.out.println("[ 1 |   |   ]");
          break;
        case 4:
        case 5:
          System.out.println("[   | X |   ]");
          break;
        case 6:
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
