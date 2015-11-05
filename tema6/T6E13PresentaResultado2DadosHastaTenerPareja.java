/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
 *tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo
 *valor.
 *
 * @author David Bernal Guerrero
 **/

  public class T6E13PresentaResultado2DadosHastaTenerPareja{
    public static void main(String[] args) {

      boolean tirada = false;
      int dadoA = 0;
      int dadoB = 0;

      while (!tirada) {
        
        dadoA = (int)(Math.random() * 6) + 1;
        dadoB = (int)(Math.random() * 6) + 1;
        
        System.out.println(dadoA + " y " + dadoB);

        if (dadoA == dadoB) {
          tirada = true;
        }
      }
    }
  }
