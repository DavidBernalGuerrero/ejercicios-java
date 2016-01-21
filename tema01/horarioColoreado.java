/**
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un
 *color diferente.
 *
 * @author David Bernal Guerrero
 */

  public class horarioColoreado {			
    public static void main(String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";


      System.out.println(rojo + "FOL" + verde + "\tPROG" + naranja + "\tSIN" + verde + "\tPROG" + morado + "\tBBDD");
      System.out.println(rojo + "FOL" + verde + "\tPROG" + naranja + "\tSIN" + verde + "\tPROG" + morado + "\tBBDD");
      System.out.println(rojo + "FOL" + verde + "\tPROG" + naranja + "\tSIN" + verde + "\tPROG" + morado + "\tBBDD");
      System.out.println(blanco + "\t\tRECREO");
      System.out.println(verde + "PROG" + morado + "\tBBDD" + naranja + "\tSIN" + blanco + "\tED" + verde + "\tPROG");
      System.out.println(blanco + "ED" + morado + "\tBBDD" + azul + "\tLM" + azul +"\tLM" + naranja + "\tSIN");
      System.out.println(blanco + "ED" + morado + "\tBBDD" + azul + "\tLM" + azul +"\tLM" + naranja + "\tSIN" + blanco);
    }
  }
