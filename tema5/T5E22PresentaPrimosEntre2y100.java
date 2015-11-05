/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 * @author David Bernal Guerrero
 */

  public class T5E22PresentaPrimosEntre2y100 {
    public static void main(String[] args) {


      int numeroIntroducido = 2;
      int limite = 100;
            
      while (limite >= numeroIntroducido) {
        
        if ((numeroIntroducido == 2) || (numeroIntroducido == 3)) {
          System.out.println(numeroIntroducido);
        }                                                // Control de las excepciones del 2 y el 3.
          
        if ((numeroIntroducido % 2 != 0) && (numeroIntroducido % 3 != 0)) {
          System.out.println(numeroIntroducido);
        }                                             // Ignora el 2 y el 3, pero controla el resto.
        
        numeroIntroducido++;
      }
    }
  }
