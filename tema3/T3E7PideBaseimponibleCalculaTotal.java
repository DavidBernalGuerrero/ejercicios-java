/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 *imponible.
 *
 * @author David Bernal Guerrero
 */

  public class T3E7PideBaseimponibleCalculaTotal {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca la base imponible de su factura: ");      
    double baseImponible = Double.parseDouble( System.console().readLine());
    
    System.out.println("|                                   ______________  |");
    System.out.printf("| Base Imponible.................. |     %4.2f  €| |\n"            //CORREGIR MOVIMIENTO DE CIFRAS
      ,baseImponible);
    System.out.printf("| I.V.A. ......................... |         %d  %%| |\n"
      , 21);
    System.out.println("|                                  |--------------| |");
    System.out.printf("|                     TOTAL....... |      %.2f €| |\n"
      , (baseImponible+(baseImponible*21)/100));
    System.out.println("|                                  |______________| |");
    System.out.println("|___________________________________________________|");

    }
  }
