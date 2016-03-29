
package Ej04Cap09;

/**
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
 *métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 *
 * @author David Bernal
 */
public class PooJavaEj04Cap09 {
  
  public static void main(String[] args) {
   
    Fraccion fraccion1 = new Fraccion(40, 20);
    Fraccion fraccion2 = new Fraccion(7, 9);
    
    System.out.println(fraccion1);
    
    System.out.println();
    
    System.out.println(fraccion2);
    
    System.out.println("\nVamos a simplificar:");
    fraccion1.simplifica();
    System.out.println(fraccion1);
    
    System.out.println("\nVamos a multiplicar ambas fracciones: ");
    fraccion1.multiplica(fraccion2);
    System.out.println(fraccion1);
    
    System.out.println("\nVamos a dividir ambas fracciones: ");
    fraccion1.divide(fraccion2);
    System.out.println(fraccion1);
    
  }
}
