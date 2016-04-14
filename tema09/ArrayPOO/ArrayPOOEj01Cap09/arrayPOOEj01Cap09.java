
package ArrayPOOEj01Cap09;

import java.util.Scanner;

/**
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
 *de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
 *todos los gatos utilizando también un bucle.
 *
 * @author David Bernal
 */
public class arrayPOOEj01Cap09 {
  
  static Scanner s = new Scanner(System.in);
  
    public static void main(String[] args) {
      
      Gato[] gatitos = new Gato[4];
      
      for (int j = 0; j < 4; j++){
        
        gatitos[j] = new Gato();
        System.out.println("INTRODUCE LOS DATOS DE LOS GATITOS: ");         

        System.out.println("Nombre: "); 
        gatitos[j].setNombre(s.nextLine());
        
        System.out.println("Edad: "); 
        gatitos[j].setEdad(s.nextLine());
        
        System.out.println("Sexo: "); 
        gatitos[j].setSexo(s.nextLine());
        
        System.out.println("Gestación: "); 
        gatitos[j].setGestacion(s.nextLine());
        
        System.out.println("Raza: "); 
        gatitos[j].setRaza(s.nextLine());
      }
      
      //Lectura
      for (Gato gato: gatitos) {
        System.out.println(gato); 
      }
    }
}
