/**
 * Escribe un programa en el que se declaren las variables enteras x e y . Asignales los valores
 *144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable,
 *la suma, la resta, la división y la multiplicación.
 *
 * @author David Bernal Guerrero
 */

  public class T2E1OperacionesVariables {			
    public static void main(String[] args) {

    int x = 144;
    int y = 999;
    
      System.out.println("El valor de y es: " + y + "\t\tEl valor de x es: " + x);
      System.out.println("La suma de ambos es: " + (y + x));
      System.out.println("La resta de ambos es: " + (y - x));
      System.out.println("La división de ambos números es: " + (y / x));
      System.out.println("La multiplicación de ambos números es: " + (y * x));
      
    }
  }
