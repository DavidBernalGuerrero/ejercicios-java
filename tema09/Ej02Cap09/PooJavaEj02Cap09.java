
package Ej02Cap09;

import java.util.Scanner;

/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de la primera.
 *Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy kilometrosTotales,
 *así como el atributo de instancia kilometrosRecorridos. Crea también algún método
 *específico para cada una de las subclases. Prueba las clases creadas mediante un programa
 *con un menú como el que se muestra a continuación:
 *
 * @author David Bernal Guerrero
 */
public class PooJavaEj02Cap09 {
  
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);  

    System.out.println("VEHÍCULOS");
    System.out.println("=========");
    System.out.println("1. Anda con la bicicleta"); 
    System.out.println("2. Haz el caballito con la bicicleta");
    System.out.println("3. Anda con el coche");
    System.out.println("4. Quema rueda con el coche");
    System.out.println("5. Ver kilometraje de la bicicleta");
    System.out.println("6. Ver kilometraje del coche");
    System.out.println("7. Ver kilometraje total");
    System.out.println("8. Salir");
    
    Bicicleta bicicleta = new Bicicleta();
    Coche coche = new Coche();
    

    boolean salir = false;
    
    while (!salir) {
      
      System.out.println("Elige una opción (1-8): "); 
      int opcion = Integer.parseInt(s.nextLine());    

      switch (opcion) {
        case 1:
          bicicleta.recorre((int)(Math.random()*1000));
          break;
        case 2:
          System.out.println("¡Mírame! Estoy haciendo el caballito.");
          break;
        case 3:
          coche.recorre((int)(Math.random()*1000));          
          break;
        case 4:
          System.out.println("¡Mira como quemo ruedas, los circulos son perfectos!");
          break;
        case 5:
          System.out.println(bicicleta.getKilometrosRecorridos());
          break;
        case 6:
          System.out.println(coche.getKilometrosRecorridos());
          break;
        case 7:
          System.out.println(Vehiculo.getKilometrosTotales());
          break;
        case 8:
            salir = true;
          break;
        default:
          System.out.println("El número introducido no es correcto. Por favor introduzca un nuevo número.");
          break;
      }
    }
  }
}
