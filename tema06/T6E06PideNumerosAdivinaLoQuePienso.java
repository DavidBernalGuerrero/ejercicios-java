/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
 *y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
 *oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
 *
 * @author David Bernal Guerrero
 **/

  public class T6E06PideNumerosAdivinaLoQuePienso {
    public static void main(String[] args) {

      int numeroSecreto = (int)(Math.random() * 101);
      int numeroIntroducido = 0;
      int contador = 0;
      int intentos = 5;
      boolean acertado = false;

      System.out.print("Intenta averiguar el número en el que estoy pensando.");
      System.out.println(" Recuerda que el número Secreto es entero. ");

      for (contador = 0; contador < 5 && !acertado; contador++) {
        intentos--;  // Control de intentos
        
        System.out.println("Introduzca un número: ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());

        if (numeroIntroducido != numeroSecreto) {
          if (numeroIntroducido > numeroSecreto) {
            System.out.println("El número Secreto es menor.");
          }
          if (numeroIntroducido < numeroSecreto) {
            System.out.println("El número Secreto es mayor.");
          }

          System.out.println("Le quedan " + intentos + " intentos.");

        } else {
          System.out.println("¡Felicidades! Has acertado el número Secreto");
          acertado = true;       // Cierre del programa
        } //Acierto
      } // For

      if (acertado == false) {
        System.out.println("\nLo siento. No le quedan más intentos.");
        System.out.println("El número Secreto era: " + numeroSecreto);
      } // No acierto
    }
  }
