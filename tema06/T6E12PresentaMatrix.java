/**
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código
 *ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un
 *carácter.
 *
 * @author David Bernal Guerrero
 **/

  public class T6E12PresentaMatrix {
    public static void main(String[] args) {

      int repeticion = 0;
      int simboloMatrix = 0;
      String verde = "\033[32m";

      while (repeticion < 1) {
        simboloMatrix = (int)(Math.random() * 95) + 32;

        System.out.print(verde + (char)simboloMatrix);
      }
    }
  }
