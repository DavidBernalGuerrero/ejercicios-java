
package Ej07Cap09;

import java.util.Scanner;

/**
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches Campanillas que
 *tiene 3 zonas, la sala principal con 1000 entradas disponibles, la zona de compra-venta con
 *200 entradas disponibles y la zona vip con 25 entradas disponibles. Hay que controlar que
 *existen entradas antes de venderlas.
 *La clase Zona con sus atributos y métodos se muestra a continuación:
 *
 * @author David Bernal
 */
public class PooJavaEj07Cap09 {
  
  static Zona salaPrincipal = new Zona(1000);
  static Zona compraVenta = new Zona(200);
  static Zona vip = new Zona(25);
  static Scanner s = new Scanner(System.in); 
  
  public static void main(String[] args) {
    
    boolean salir = false;
    
    while (!salir) {
      
      System.out.println("1. Mostrar número de entradas libres"); 
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");      
      
      System.out.println("Elige una opción (1-3): "); 
      int opcion = Integer.parseInt(s.nextLine());          
      
      switch (opcion) {
        case 1:
          preguntaZona(opcion);
          break;
        case 2:
          preguntaZona(opcion);
          break;
        case 3:
          salir = true;
          break;
        default:
          System.out.println("El número introducido no es correcto. Por favor introduzca un nuevo número.");
          break;          
      }
    }
  }

  private static void preguntaZona(int modo) {
    
    boolean salir = false;
    String zolaElegida = "";
    int numEntradas = 0;
    
    while (!salir) {
      
      System.out.println("1. Sala Principal"); 
      System.out.println("2. Zona de Compra-venta");
      System.out.println("3. Zona Vip");  
      
      System.out.println("\n¿En qué zona estás interesao/a?");
      int opcion = Integer.parseInt(s.nextLine());  
      
      if (modo == 2) {
        System.out.println("\n¿Cúantas entradas desea comprar?");
        numEntradas = Integer.parseInt(s.nextLine());  
      }
         
      switch (opcion) {
        case 1:
          if (modo == 1) {
            System.out.println(salaPrincipal.getEntradasPorVender());
          } else {
            salaPrincipal.vender(numEntradas);
          }
          salir = true;
          break;
        case 2:
          if (modo == 1) {
            System.out.println(compraVenta.getEntradasPorVender());
          } else {
            compraVenta.vender(numEntradas);
          }
          salir = true;          
          break;
        case 3:
          if (modo == 1) {
            System.out.println(vip.getEntradasPorVender());
          } else {
            vip.vender(numEntradas);
          }
          salir = true;          
          break;
        default:
          System.out.println("El número introducido no es correcto. Por favor introduzca un nuevo número.");
          break;          
      }
    }  
  }
}