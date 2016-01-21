/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter 
 *con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =,
 *., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
 *
 * @author David Bernal Guerrero
 **/

  public class T6E10Presenta10LineasCaracteresAleaCantidadAlea {
    public static void main(String[] args) {

      int caracterAleatorio = 0;
      String simbolo = "";
      int relleno = 0;
      int cantidadCaracter = 0;

      for (int linea = 1; linea <= 10; linea++) {
        caracterAleatorio = (int)(Math.random() * 5);
        
        switch (caracterAleatorio) {
          
          case 0:                                                           //tipo de relleno
            simbolo = "*";
            break;
          case 1:
            simbolo = "-";
            break;
          case 2:
            simbolo = "=";
            break;
          case 3:
            simbolo = ".";
            break;
          case 4:
            simbolo = "|";
            break;
          case 5:
            simbolo = "@";
            break;
            
          default:
            break;
        }

        cantidadCaracter = (int)(Math.random() * 40) + 1;                 // cantidad relleno

        while (relleno < cantidadCaracter) {                              // relleno
          System.out.print(simbolo);
          relleno++;
        }
        relleno = 0;
        System.out.println();
      }
    }
  }
