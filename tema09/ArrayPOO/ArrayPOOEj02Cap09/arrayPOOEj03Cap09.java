
package ArrayPOOEj02Cap09;

import java.util.Scanner;

/**
 * Cambia el programa anterior de tal forma que los datos de los gatos se introduzcan
 *directamente en el código de la forma gatito[2].setColor(“marrón”) o bien
 *mediante el constructor, de la forma gatito[3] = new Gato(“Garfield”, “naranja”,
 *“macho”). Muestra a continuación los datos de todos los gatos utilizando un
 *bucle.
 *
 * @author David Bernal
 */
public class arrayPOOEj03Cap09 {
  
  static Scanner s = new Scanner(System.in);
  
    public static void main(String[] args) {
      
      Gato[] gatitos = new Gato[4];
      
      String[] preguntas = {"Nombre", "Edad", "Sexo", "Gestación", "Raza"};
      String[] respuestas = new String[5];
      

      for (int j = 0; j < 4; j++){
        System.out.println("INTRODUCE LOS DATOS DE LOS GATITOS: ");         
        
        for (int i = 0; i < 5; i++){

          System.out.println(preguntas[i] + ": "); 
          respuestas[i] = s.nextLine();
        }
        
        gatitos[j] = new Gato (respuestas[0], respuestas[1], respuestas[2], respuestas[3], respuestas[4]);
      }
      
      
      for (Gato gato: gatitos) {
        System.out.println(gato); 
      }
    }
}
