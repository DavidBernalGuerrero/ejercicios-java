
package Ej03Cap09;

/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 *al menos, tres métodos específicos de cada clase y redefne el/los método/s cuando sea
 *necesario. Prueba las clases creadas en un programa en el que se instancien objetos y se les
 *apliquen métodos.
 *
 * @author David Bernal Guerrero
 */
public class PooJavaEj03Cap09 {
  
  public static void main(String[] args) {
   
    Gato mimosa = new Gato("3 meses", "hembra", "6 meses", "Ragdoll");
    Perro turco = new Perro("1 año", "macho", "7 meses", "Pasto Alemán");
    Pinguino pingu = new Pinguino("1 año", "macho", "7 meses", "Pasto Alemán");
    Canario piolin = new Canario("1 año", "macho", "13 días", "Común");
    Lagarto creg = new Lagarto("2 años", "macho", "72 días", "Iguana");
    
    piolin.pia();
    
    turco.aulla();
    turco.duerme();
    
    creg.detecta();
    
    piolin.vuela();
    pingu.vuela();
    
    pingu.deslizate();
    
    mimosa.getEdad();
    mimosa.ronronea();
  }
}
