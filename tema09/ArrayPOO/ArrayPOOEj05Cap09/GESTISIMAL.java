
package ArrayPOOEj05Cap09;

import ArrayPOOEj04Cap09.Disco;
import java.util.Scanner;

/**
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar
 *el control de los artículos de un almacén. De cada artículo se debe saber
 *el código, la descripción, el precio de compra, el precio de venta y el stock
 *(número de unidades). El menú del programa debe tener, al menos, las
 *siguientes opciones:
 *1. Listado
 *2. Alta
 *3. Baja
 *4. Modificación
 *5. Entrada de mercancía
 *6. Salida de mercancía
 *7. Salir
 *La entrada y salida de mercancía supone respectivamente el incremento y
 *decremento de stock de un determinado artículo. Hay que controlar que no se
 *pueda sacar más mercancía de la que hay en el almacén.
 *
 * @author David Bernal
 */
public class GESTISIMAL {
  
  static Scanner s = new Scanner(System.in);
  
  public static void main(String[] args) {

    Articulo[] articulos = new Articulo[5];

    boolean salir = false;
    int opciones;
    
    while (!salir) {
      
      
      System.out.println("\n\n████████████");
      System.out.println("█ OPCIONES █");
      System.out.println("██████████████████████████████████████████████████");
      System.out.println("█ 1. Listado.                                    █");
      System.out.println("█ 2. Alta.                                       █");
      System.out.println("█ 3. Baja                                        █");
      System.out.println("█ 4. Modificación.                               █");
      System.out.println("█ 5. Entrada de mercancía.                       █");
      System.out.println("█ 6. Salida de mercancía.                        █");
      System.out.println("█ 7. Salir.                                      █");
      System.out.println("██████████████████████████████████████████████████");    
      System.out.println("¿Qué desea hacer?: ");   
      opciones = Integer.parseInt(s.nextLine());
      
      switch (opciones) {
        case 1:
          Articulo.listado(articulos);
          break;
        case 2:
          Articulo.alta(articulos);
          break;
        case 3:
          Articulo.baja(articulos);
          break;
        case 4:
          Articulo.modificacion(articulos);
          break;
        case 5:
          Articulo.entradaMercancia(articulos);
          break;
        case 6:
          Articulo.salidaMercancia(articulos);
          break;
        case 7:
          salir = true;
          break;
        default:
          System.out.println("La opción elegida no es correcta. Por favor, introduzca una nueva opción.");
      }
    }
  }
}
