/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 *introducidos por teclado.
 *
 * @author David Bernal Guerrero
 */

  public class T3E4PideNumOperaciones {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número: ");
    double primerNum = Double.parseDouble( System.console().readLine());

    System.out.print("Por favor, introduzca un segundo número: ");
    double segundoNum = Double.parseDouble( System.console().readLine());    

    System.out.println("\nEl primer número introducido es: " + primerNum +
      ". Y el segundo es: " + segundoNum);

    System.out.println("La suma de ambos es: " + (primerNum + segundoNum));    
    System.out.println("La resta de ambos es: " + (primerNum - segundoNum));    
    System.out.println("La multiplicación de ambos es: " + (primerNum +
      segundoNum));    
    System.out.println("La división de ambos es: " + (primerNum / segundoNum));    
      
    }
  }
