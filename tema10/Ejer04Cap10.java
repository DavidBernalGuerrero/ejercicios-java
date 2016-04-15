package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 *debe ordenar palabras en lugar de números.
 *
 * @author David Bernal
 */
public class Ejer04Cap10 {
  
    public static void main(String[] args) {
      
    Scanner s = new Scanner(System.in);
    ArrayList<String> elementos = new ArrayList();
    
    for (int i = 0; i < 10; i++) {
      System.out.println("Introduce una palabra: ");
      elementos.add(s.nextLine());
    }
    
    Collections.sort(elementos);
    
    System.out.println("Las palabras introducidass bien ordenados de forma "
            + "ascendente serán: ");
    for (String palabra : elementos) {
      System.out.print(palabra + " ");
    }
    
    // El segundo parámetro le indica un modo de compareTo alternativo, para este caso
    // un modo de comparar elementos de forma descendente.
    Collections.sort(elementos, Collections.reverseOrder());
    
    System.out.println("\nLas palabras introducidass bien ordenados de forma "
            + "descendiente serán: ");
    for (String palabra : elementos) {
      System.out.print(palabra + " ");
    }    
  }
}
