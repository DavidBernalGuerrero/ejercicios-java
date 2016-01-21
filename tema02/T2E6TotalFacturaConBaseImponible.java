/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 *imponible (precio sin IVA). La base imponible estará almacenada en una
 *variable.
 *
 * @author David Bernal Guerrero
 */

  public class T2E6TotalFacturaConBaseImponible {			
    public static void main(String[] args) {

    double baseImponible = 100;
    int iva = 21;
    double total;

    total = baseImponible + (baseImponible * iva/100);
    //total = baseImponible + (baseImponible * (21/100));        NO FUNCIONA PORQUE EL PARENTESIS ES UN ENTERO CON OTRO ENTERO Y EL RESULTADO ES 0.21, IGNORA EL ".21" Y SOLO TIENE EN CUENTA EL 0
    
    System.out.println("|                                   ______________  |");
    System.out.printf("| Base Imponible.................. |     %4.2f  €| |\n"
      ,baseImponible);
    System.out.printf("| I.V.A. ......................... |         %d  " 
      ,iva);
    System.out.println("%| |");                      //Conflicto al usar "\%" es necesario usar %% para poder escapar el símbolo
    System.out.println("|                                  |--------------| |");
    System.out.printf("|                     TOTAL....... |      %.2f €| |\n"
      ,total);
    System.out.println("|                                  |______________| |");
    System.out.println("|___________________________________________________|");

    }
  }
