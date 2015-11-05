/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está
formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8,
9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una cadena de caracteres
podemos usar String.valueOf(n) .
 *
 * @author David Bernal Guerrero
 */

  public class T6E02PresentaCartaBarajaFrancesa {
    public static void main(String[] args) {

      int figura = (int)(Math.random() * 13) + 1;
      String resultadoFigura = "";
      
      int palo = (int)(Math.random() * 4) + 1;
      String resultadoPalo = "";

      switch (palo) {
        case 1:
          resultadoPalo = "♥";
          break;
        case 2:
          resultadoPalo = "♣";
          break;
        case 3:
          resultadoPalo = "♦";
          break;
        case 4:
          resultadoPalo = "♠";
          break;
        default:
          break;
          
        }

      switch (figura) {

        case 1:
          resultadoFigura = "A";
          break;
        case 2:           // Va saltando el codigo pero siempre mantiene el valor del case por donde ha entrado.
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
          resultadoFigura = String.valueOf(figura);       // Funciona como un casting de figura, pasando figura de in a cadena de caracteres.
          break;
        case 11:
          resultadoFigura = "J";
          break;
        case 12:
          resultadoFigura = "Q";
          break;
        case 13:
          resultadoFigura = "K";
          break;
        default:
          break;
      }

      System.out.println(resultadoFigura + " de " + resultadoPalo);
    }
  }
