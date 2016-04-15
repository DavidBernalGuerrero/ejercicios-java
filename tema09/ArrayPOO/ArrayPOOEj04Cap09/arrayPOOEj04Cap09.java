
package ArrayPOOEj04Cap09;

import ArrayPOOEj04Cap09.Disco;
import java.util.Scanner;

/**
 * Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
 *posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
 ^funciona y luego intenta implementarlo tú mismo.
 *
 * @author David Bernal
 */
public class arrayPOOEj04Cap09 {
  
  static Scanner s = new Scanner(System.in);
  
  public static void main(String[] args) {

    Disco[] discos = new Disco[5];

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
