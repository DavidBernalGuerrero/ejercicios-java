/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
 *espacios. Muestra también el máximo, el mínimo y la media de esos números.
 *
 * @author David Bernal Guerrero
 **/

  public class T6E05Presenta50NumAleaMediaMayorYMenor {
    public static void main(String[] args) {

      int numero = 0;
      int suma = 0;
      int numeroMaximo = 0;
      int numeroMinimo = 199;

      for (int contador = 0; contador < 50; contador++) {
        numero = (int)(Math.random() * 100) + 100;
        suma += numero;

        System.out.print(numero + " ");

        if (numero > numeroMaximo) {
          numeroMaximo = numero;
        } //Comparador mayor
        
        if (numero < numeroMinimo) {
          numeroMinimo = numero;
        } // Comparador menor

      } // For
        
        System.out.println("\nLa media de todos ellos es: " + (suma/50));
        System.out.println("El mayor de todos los números es: " + numeroMaximo);
        System.out.println("El menor de todos los números es: " + numeroMinimo);
    }
  }
