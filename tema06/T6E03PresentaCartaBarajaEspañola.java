/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
 *2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author David Bernal Guerrero
 */

  public class T6E03PresentaCartaBarajaEspañola {
    public static void main(String[] args) {

      int figura = (int)(Math.random() * 10) + 1;
      String resultadoFigura = "";
      
      int palo = (int)(Math.random() * 4) + 1;
      String resultadoPalo = "";

      switch (palo) {
        case 1:
          resultadoPalo = "Oro";
          break;
        case 2:
          resultadoPalo = "Copas";
          break;
        case 3:
          resultadoPalo = "Espadas";
          break;
        case 4:
          resultadoPalo = "Bastos";
          break;
        default:
          break;
          
        }

      switch (figura) {

        case 1:
          resultadoFigura = "As";
          break;
        case 2:           // Va saltando el codigo pero siempre mantiene el valor del case por donde ha entrado.
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
          resultadoFigura = String.valueOf(figura);       // Funciona como un casting de figura, pasando figura de in a cadena de caracteres.
          break;
        case 8:
          resultadoFigura = "Sota";
          break;
        case 9:
          resultadoFigura = "Caballo";
          break;
        case 10:
          resultadoFigura = "Rey";
          break;
        default:
          break;
      }

      System.out.println(resultadoFigura + " de " + resultadoPalo);
    }
  }
