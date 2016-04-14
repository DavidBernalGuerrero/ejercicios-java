
package ArrayPOOEj03Cap09;

import java.util.Scanner;



public class Disco {
  
  static Scanner s = new Scanner(System.in);
  
  private String codigo;
  private String nombre;
  private String album;
  private String anoLanzamiento;
  private String edicion;
  private String formato;
  private String estado;

  public Disco () {

    System.out.println("Código: ");
    this.codigo = s.nextLine();    
    
    System.out.println("Nombre: ");
    this.nombre = s.nextLine();

    System.out.println("Album: ");
    this.album = s.nextLine();

    System.out.println("Año de lanzamiento: ");
    this.anoLanzamiento = s.nextLine();

    System.out.println("Edición (Limitada, Coleccionista, Disco del Año,  Recopilación, etc...): ");
    this.edicion = s.nextLine();

    System.out.println("Formato: ");
    this.formato = s.nextLine();
  }
  
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public String getAnoLanzamiento() {
    return anoLanzamiento;
  }

  public void setAnoLanzamiento(String añoLanzamiento) {
    this.anoLanzamiento = añoLanzamiento;
  }

  public String getEdicion() {
    return edicion;
  }

  public void setEdicion(String edicion) {
    this.edicion = edicion;
  }

  public String getFormato() {
    return formato;
  }

  public void setFormato(String formato) {
    this.formato = formato;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
  
  public static void añadeDisco (Disco[] discos) {
    
    boolean anadido = false; //Una vez la operación se realiza con éxito sale del bucle.
    
    for (int i = 0; (i < discos.length) && (!anadido); i++) {
      if ((discos[i] == null) || (discos[i].getEstado().equals("VACIO"))) {
        discos[i] = new Disco();
        discos[i].setEstado("OCUPADO");
        anadido =  true;
      }
    }
  }
  
  public static void modificaDisco (Disco[] discos) {
    System.out.println("Introduce el código del disco que desea modificar: ");
    String referencia = s.nextLine();
    
    int opcion;
    String nuevoValor;
    boolean modificado = false;
    boolean salir = false;
    
    for (int i = 0; (i < discos.length) && (!modificado); i++) {
      if ((discos[i] != null) && (discos[i].getCodigo().equals(referencia))) {
        while (!salir) {
          System.out.println("¿Qué valor desea modificar?");
          System.out.println("1. Código.");
          System.out.println("2. Nombre.");
          System.out.println("3. Album.");
          System.out.println("4. Año de Lanzamiento del disco.");
          System.out.println("5. Edición del disco.");
          System.out.println("6. Formato del disco.");
          System.out.println("7. Cancelar. Salir del asistente de modificación.");
          opcion = Integer.parseInt(s.nextLine());
          
          switch (opcion) {
            case 1:
              System.out.println("Nuevo valor de 'Código': ");
              nuevoValor = s.nextLine();
              discos[i].setCodigo(nuevoValor);
              modificado = true;
              break;
            case 2:
              System.out.println("Nuevo valor de 'Nombre': ");
              nuevoValor = s.nextLine();
              discos[i].setNombre(nuevoValor);
              modificado = true;
              break;
            case 3:
              System.out.println("Nuevo valor de 'Album': ");
              nuevoValor = s.nextLine();
              discos[i].setAlbum(nuevoValor);
              modificado = true;
              break;
            case 4:
              System.out.println("Nuevo valor de 'Año de lanzamiento': ");
              nuevoValor = s.nextLine();
              discos[i].setAnoLanzamiento(nuevoValor);
              modificado = true;
              break;
            case 5:
              System.out.println("Nuevo valor de 'Edición del disco': ");
              nuevoValor = s.nextLine();
              discos[i].setEdicion(nuevoValor);
              modificado = true;
              break;
            case 6:
              System.out.println("Nuevo valor de 'Formato de disco': ");
              nuevoValor = s.nextLine();
              discos[i].setFormato(nuevoValor);
              modificado = true;
              break;
            case 7:
              salir = true;
              break;
            default:
              System.out.println("Opción incorrecta. Por favor introduzca una "
                      + "nueva opción.");
          }
        }
      }
    }
    if (modificado) {
      System.out.println("El disco se ha modificado con éxito.");
    } else {
      System.out.println("No se ha encontrado ningún disco que corresponda al "
              + "código de referencia introducido. Interrumpiendo Modificación");
    }
  }
  
  public static void borraDisco (Disco[] discos) {
    System.out.println("Introduce el código del disco que desea borrar: ");
    String referencia = s.nextLine();
    boolean borrado = false;
    
    for (int i = 0; (i < discos.length) && (!borrado); i++) {
      if ((discos[i] != null) && (discos[i].getCodigo().equals(referencia))) {
        discos[i] = null;
        borrado = true;
        System.out.println("Borrado del disco realizado con éxito.");
      }
    }
  }
  
  public static void muestraLista (Disco[] discos) {
    
    for (Disco d : discos) {
      if ((d != null) && (d.getEstado().equals("OCUPADO"))) {
        System.out.println("\n██████████████████████████████████████████████████\n");
        System.out.println(d);
        System.out.println("\n██████████████████████████████████████████████████\n");
      }
    }    
  }
  
  @Override
  public String toString() {
    return "Código: " + this.codigo + "\nNombre del disco: " + this.nombre + "\nAlbum: " + 
            this.album + "\nAño de Lanzamiento: " + this.anoLanzamiento + "\nEdición: " + 
            this.edicion + "\nTipo de formato: " + this.formato;
  }
  
  
  
  
}
