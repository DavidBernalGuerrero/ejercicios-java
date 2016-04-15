
package arraylist;

/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 *muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 *todo el ArrayList sin usar ningún índice.
 *
 * @author David Bernal
 */

import java.util.ArrayList;

public class Ejer01Cap10 {

  public static void main(String[] args) {
   
    ArrayList<String> companeros = new ArrayList();
    
    companeros.add("Marta");
    companeros.add("Marcos");
    companeros.add("Manuel");
    companeros.add("Manolo");
    companeros.add("Manuelita");
    companeros.add("Mario");
    
    for (String dato : companeros) {
      System.out.println("Alumno: " + dato);
    }
  }
}
