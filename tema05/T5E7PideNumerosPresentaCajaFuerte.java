/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un número
 *de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no 
 *acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y 
 *si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
 *Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author David Bernal Guerrero
 */

  public class T5E7PideNumerosPresentaCajaFuerte {
    public static void main(String[] args) {

      int contraseña = 7622;
      int numeroIntroducido = 0;
      int intentos = 3;

      System.out.println("Por favor, introduzca la clave.");
      numeroIntroducido = Integer.parseInt(System.console().readLine());


      if (numeroIntroducido != contraseña) {

        do {
          
          
          if (numeroIntroducido != contraseña) {

            System.out.println("El número introducido no es correcto.");
              System.out.println("Por favor introduzca la clave (Quedan " + intentos
              + " intentos)");
            numeroIntroducido = Integer.parseInt(System.console().readLine());

            intentos -= 1;
          }
          
        } while ((numeroIntroducido != contraseña) && (intentos > 0));
        
        System.out.print("Ha agotado el número de intentos. La caja pasará ");
        System.out.println("a bloquearse de forma indefinida.");
        System.out.println("BLOQUEO DE SEGURIDAD ACTIVADO");
        
      } else { 

        System.out.print("Contraseña aceptada. ¡Bienvenido!");
      }
    }
  }
