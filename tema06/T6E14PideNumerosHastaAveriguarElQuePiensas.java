/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
 *intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para
 *ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que
 *estás pensando es mayor o menor que el que te acaba de decir.
 *
 * @author David Bernal Guerrero
 **/

  public class T6E14PideNumerosHastaAveriguarElQuePiensas {
    public static void main(String[] args) {

      int numeroGenerado = 0;
      String respuestaUsuario = "";
      int intentos = 5;
      int numeroMaximo = 101;
      int numeroMinimo = 0;
      boolean acierto = false;

      System.out.println("Voy a averiguar el número en el que estás pensando.");
      System.out.println("Dime si es mayor, si es menor e incluso si he acertado:");

      while ((intentos > 0) && (!acierto)) {
        numeroGenerado = (int)(Math.random() * (numeroMaximo-numeroMinimo)) + numeroMinimo;

        System.out.println("El número en el que estoy pensando es: " + numeroGenerado + ".");
        System.out.println("¿Es mayor(M) o menor(m)? Recuerda, en caso de acertar dime (correcto).");
        respuestaUsuario = System.console().readLine();

        if (respuestaUsuario.equals("M")) {
          numeroMinimo = numeroGenerado + 1;
        } 

        if (respuestaUsuario.equals("m")) {
          numeroMaximo = numeroGenerado - 1;                                // +1 para ajustar al 0
        }

        if (respuestaUsuario.equals("correcto")) {
          acierto = true;
        }
        
      intentos--;
        
      } // For

      if (acierto == false) {
        System.out.println("Eres muy bueno. La próxima vez te venceré.");
      } else {
        System.out.println("¡Sabía que lo lograría!");
      }
    }
  }
