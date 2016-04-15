
package arraylist.Ejer05Cap10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
 *una lista para almacenar la información sobre los discos en lugar de un array
 *convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
 *ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
 *programa hecho con una lista?
 *
 * @author David Bernal
 */
public class arrayPOOEj05Cap09 {
  
  static Scanner s = new Scanner(System.in);
  
  public static void main(String[] args) {

    ArrayList<Disco> discos = new ArrayList();

    boolean salir = false;
    int opciones;
    
    while (!salir) {
      
      
      System.out.println("\n\n████████████");
      System.out.println("█ OPCIONES █");
      System.out.println("██████████████████████████████████████████████████");
      System.out.println("█ 1. Guardar un nuevo disco.                     █");
      System.out.println("█ 2. Borrar un disco existente.                  █");
      System.out.println("█ 3. Modificar los datos de un disco almacenado. █");
      System.out.println("█ 4. Listado completo de los discos almacenados. █");
      System.out.println("█ 5. Salir del programa.                         █");
      System.out.println("██████████████████████████████████████████████████");    
      System.out.println("¿Qué desea hacer?: ");   
      opciones = Integer.parseInt(s.nextLine());
      
      switch (opciones) {
        case 1:
          Disco.añadeDisco(discos);
          break;
        case 2:
          Disco.borraDisco(discos);
          break;
        case 3:
          Disco.modificaDisco(discos);
          break;
        case 4:
          Disco.muestraLista(discos);
          break;
        case 5:
          salir = true;
          break;
        default:
          System.out.println("La opción elegida no es correcta. Por favor, introduzca una nueva opción.");
      }
    }
  }
}
