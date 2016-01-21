/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 *pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 *pedir por teclado.
 *
 * @author David Bernal Guerrero
 */

  public class T5E20PideAlturaCaracterPresentaPiramideHueca {
    public static void main(String[] args) {

      System.out.print("Por favor, introduzca la altura de la pirámide: ");
      int altura = Integer.parseInt(System.console().readLine());
      
      System.out.print("Por favor, introduzca el símbolo de la pirámide: ");
      String simbolo = System.console().readLine();

      int contador = 2;
      int limiteEspacios = altura - 2;
      int limiteHorizontal = 1;
      int contadorEspacios = 0;
      int contadorSimbolo = 0;
      
      while (contador < altura) {
        
        while (limiteEspacios > contadorEspacios) {
          System.out.print(" ");
          contadorEspacios++;
        }

        System.out.print(simbolo);

        limiteEspacios -= 1;
        contadorEspacios = 0;

        for (contadorSimbolo = 0; contadorSimbolo < limiteHorizontal; contadorSimbolo++){
          System.out.print(" ");
        }

        limiteHorizontal += 2;

        System.out.print(simbolo);

        contador++;
        System.out.println();
      }
      
      for (contadorSimbolo = 0; contadorSimbolo < (altura * 2 - 1); contadorSimbolo++){
        System.out.print(simbolo);
      } // base de la pirámide
    }
  }
