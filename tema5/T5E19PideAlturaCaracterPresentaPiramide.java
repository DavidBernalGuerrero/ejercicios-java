/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 *pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 *pedir por teclado.
 *
 * @author David Bernal Guerrero
 */

  public class T5E19PideAlturaCaracterPresentaPiramide {
    public static void main(String[] args) {

      System.out.print("Por favor, introduzca la altura de la pirámide: ");
      int altura = Integer.parseInt(System.console().readLine());
      
      System.out.print("Por favor, introduzca el símbolo de la pirámide: ");
      String simbolo = System.console().readLine();

      int contador = 0;
      int limiteEspacios = altura - 1;
      int limiteHorizontal = 1;
      int contadorEspacios = 0;
      int contadorSimbolo = 0;
      
      while (contador < altura) {
        
        while (limiteEspacios > contadorEspacios) {                                               // Reset externo porque while no resetea en cada iteración
          System.out.print(" ");
          contadorEspacios++;
        }

        limiteEspacios -= 1;            // Decremento del limite desde arriba
        contadorEspacios = 0;           // Reset del while

        for (contadorSimbolo = 0; contadorSimbolo < limiteHorizontal; contadorSimbolo++){         // Reset interno dentro del for, cada iteración lo resetea a 0
          System.out.print(simbolo);
        }
        
        limiteHorizontal += 2;
        
        contador++;
        System.out.println();
      }
    }
  }
