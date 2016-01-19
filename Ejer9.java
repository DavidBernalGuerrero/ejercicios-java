/*
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una
 * posición en el sentido de las agujas del reloj. La matriz debe tener 12 filas por 12 columnas
 * y debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz
 * original como la matriz resultado, ambas con los números convenientemente alineados.
 *
 * @author David Bernal Guerrero
 */

public class Ejer9 {
  public static void main(String[] args) {
    
    int [][] arrayOriginal = new int [12][12];
    
    for (int y = 0; y < 12; y++) {
      for (int x = 0; x < 12; x++) {
        arrayOriginal [x][y] = (int)(Math.random()*101);
      }
    }

    for (int y = 0; y < 12; y++) {
      for (int x = 0; x < 12; x++) {
        System.out.printf(" %3d ",arrayOriginal[y][x]);
      }
      System.out.println();
    }
    ///////////////////////ROTACION DE LOS ANILLOS//////////////////////////////
    
    int filaInicio = 0;
    int columnaInicio = 0;
    int filaTope = 11;
    int columnaTope = 11;
    int auxiliarNE;
    int auxiliarSE;
    int auxiliarSO;
    int color = 1;
    
    for (int i = 0; i < 6; i++) {
      
      auxiliarNE = arrayOriginal[filaInicio][columnaTope];    //guardado de la esquina Superior Der.
      
      for (int posicion = columnaTope; posicion > columnaInicio; posicion--) {
        arrayOriginal[filaInicio][posicion] = arrayOriginal[filaInicio][posicion-1];
      } //lado superior
      
      auxiliarSE = arrayOriginal[filaTope][columnaTope];    //guardado de la esquina Inferior Der.
      
      for (int posicion = filaTope; posicion > filaInicio+1; posicion--) {
        arrayOriginal[posicion][columnaTope] = arrayOriginal[posicion-1][columnaTope];
      } //lado derecho
      
      arrayOriginal[filaInicio+1][columnaTope] = auxiliarNE;   //escritura de la esquina Superior Der.
      auxiliarSO = arrayOriginal[filaTope][columnaInicio];    //guardado esquina Inferior Izq.
      
      for (int posicion = columnaInicio; posicion < columnaTope; posicion++) {
        arrayOriginal[filaTope][posicion] = arrayOriginal[filaTope][posicion+1];
      } //lado inferior
      
      arrayOriginal[filaTope][columnaTope-1] = auxiliarSE;    //escritura de la esquina Inferior Der.
      
      for (int posicion = filaInicio; posicion < filaTope; posicion++) {
        arrayOriginal[posicion][columnaInicio] = arrayOriginal[posicion+1][columnaInicio];
      } //lado izquierdo
      
      arrayOriginal[filaTope-1][columnaInicio] = auxiliarSO; //escritura de la esquina Inferior Izq.
      
      // ajustado de variables para los anillos interiores
      
      filaInicio += 1;
      columnaInicio +=  1;
      filaTope  -=  1;
      columnaTope -=  1;
          
    }
    
    /////////////////// COMPROBACION /////////////////////
    System.out.println("\n");
    
    for (int y = 0; y < 12; y++) {
      for (int x = 0; x < 12; x++) {
        System.out.printf(" %3d ",arrayOriginal[y][x]);
      }
      System.out.println();
    }
  }
}
