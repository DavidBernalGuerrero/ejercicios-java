
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 *y almacenados en un objeto de la clase ArrayList.
 *
 * @author David Bernal
 */
public class Ejer03Cap10 {
  
    public static void main(String[] args) {
      
    Scanner s = new Scanner(System.in);
    ArrayList<Integer> elementos = new ArrayList();
    
    for (int i = 0; i < 10; i++) {
      System.out.println("Introduce un número: ");
      elementos.add(Integer.parseInt(s.nextLine()));
    }
    
    Collections.sort(elementos);
    
    System.out.println("Los números introducidos bien ordenados de forma ascendente"
            + " serán: ");
    for (int n : elementos) {
      System.out.print(n + " ");
    }
    
    // El segundo parámetro le indica un modo de compareTo alternativo, para este caso
    // un modo de comparar elementos de forma descendente.
    Collections.sort(elementos, Collections.reverseOrder());
    
    System.out.println("\nLos números introducidos bien ordenados de forma descendiente"
            + " serán: ");
    for (int n : elementos) {
      System.out.print(n + " ");
    }    
  }
}
