/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
 *la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número
 *de suspensos, el número de suficientes, el número de bienes, etc.
 *
 * @author David Bernal Guerrero
 **/

  public class T6E11PresentaNotasYCantidadTiposNotas {
    public static void main(String[] args) {

      int notaAleatoria = 0;
      String evaluacion = "";
      int contadorSuspenso = 0;
      int contadorSuficiente = 0;
      int contadorBien = 0;
      int contadorNotable = 0;
      int contadorSobresaliente = 0;

      for (int notas = 1; notas <= 20; notas++) {
        notaAleatoria = (int)(Math.random() * 11);
        
        switch (notaAleatoria) {
          
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
            evaluacion = "Suspenso";
            contadorSuspenso++;
            break;
          case 5:
            evaluacion = "Suficiente";
            contadorSuficiente++;
            break;
          case 6:
            evaluacion = "Bien";
            contadorBien++;
            break;
          case 7:
          case 8:
            evaluacion = "Notable";
            contadorNotable++;
            break;
          case 9:
          case 10:
            evaluacion = "Sobresaliente";
            contadorSobresaliente++;
            break;
          default:
            break;

        }

        System.out.println(evaluacion);
      }
      
      System.out.println("\nRESULTADOS\n");
      System.out.println(contadorSuspenso + " suspenso/s.");
      System.out.println(contadorSuficiente + " suficiente/s.");
      System.out.println(contadorBien + " bien/es.");
      System.out.println(contadorNotable + " notable/s.");
      System.out.println(contadorSobresaliente + " sobresaliente/s.");
      
    }
  }
