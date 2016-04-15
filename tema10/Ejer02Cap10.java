
package arraylist;

import java.util.ArrayList;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 *ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 *números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 *y 20 elementos ambos inclusive.
 *
 * @author David Bernal
 */

public class Ejer02Cap10 {
  public static void main(String[] args) {
    
    int numElementos = (int)((Math.random()*11)+10);
    ArrayList<Integer> numeros = new ArrayList();
    
    
    for (int i = 0; i < numElementos; i++) {
      numeros.add((int)(Math.random()*101));
    }
    
    for (int n : numeros) {
      System.out.println(n + " ");
    }
    
    System.out.println("La suma de todos los elementos del array es: " + 
            sumaElementos(numeros));
    System.out.println("La media de todos los elementos del array es: " + 
            mediaElementos(numeros));
    System.out.println("El mayor de todos los elementos del array es: " + 
            mayorElementos(numeros));
    System.out.println("El menor de todos los elementos del array es: " + 
            menorElementos(numeros));
  }  

  private static int sumaElementos(ArrayList<Integer> numeros) {
    int resultado = 0;
    
    for (int n : numeros) {
      resultado += n;
    }
    
    return resultado;
  }

  private static double mediaElementos(ArrayList<Integer> numeros) {
    double resultado = 0;
    
    for (int n : numeros) {
      resultado += n;
    }
    
    resultado /= numeros.size();
    
    return resultado;
  }

  private static int mayorElementos(ArrayList<Integer> numeros) {
    int maximo = Integer.MIN_VALUE;
    
    for (int n : numeros) {
      if (n > maximo) {
        maximo = n;
      }
    }
    return maximo;
  }

  private static int menorElementos(ArrayList<Integer> numeros) {
    int menor = Integer.MAX_VALUE;
    
    for (int n : numeros) {
      if (n < menor) {
        menor = n;
      }
    }
    return menor;
  }
  
  
}
