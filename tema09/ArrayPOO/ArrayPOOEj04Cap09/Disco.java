
package ArrayPOOEj04Cap09;

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
  /* Todos los objetos parten como duplicados, es decir, tendrán el código duplicado
  por defecto, hasta que el comprobador detecte de que no es cierto y lo cambie a false*/
  private boolean duplicado = true;

  public Disco (Disco[] discos) {
    
    while (duplicado) {
      System.out.println("Código: ");
      this.codigo = s.nextLine();
      // Comprueba si ya existe el código
      if (!compruebaExistencia(discos, this.codigo)) {   
        // Valida que el codigo no exista y cambia el valor de duplicado a falso
        this.duplicado = false;
      } else {
        System.out.println("El código introducido ya existe. Por favor "
                + "introduzca un nuevo código.");
      }
    }
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
      if (discos[i] == null){
        discos[i] = new Disco(discos);
        discos[i].setEstado("OCUPADO");
        anadido =  true;
      }
    }
    
    if (!anadido) {
      System.out.println("No se ha podido insertar ningun disco, la lista esta LLENA. "
              + "Por favor elimine un disco para poder insertar uno nuevo en la lista.");
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
    
    if (!borrado) { 
      System.out.println("No se encuentra el disco. Por favor introduzca un"
              + " código de disco que previamente se haya introducido en la "
              + "base de datos");
    }
  }
  
  public static void muestraLista (Disco[] discos) {
    
    System.out.println("¿Por que desea filtrar?: ");
    System.out.println("1. Código.");
    System.out.println("2. Nombre.");
    System.out.println("3. Album.");
    System.out.println("4. Año de Lanzamiento del disco.");
    System.out.println("5. Edición del disco.");
    System.out.println("6. Formato del disco.");
    System.out.println("7. Cancelar. Salir del asistente de listado.");
    int opcion = Integer.parseInt(s.nextLine());
    boolean salir = false;
    boolean resultados = false;
    
    System.out.println("Introduzca el valor por el que desea filtrar: ");
    String filtroIntroducido = s.nextLine();
    
    while (!salir) {
      switch (opcion) {
        case 1:
          for (Disco d : discos) {
            if ((d != null) && (d.getEstado().equals("OCUPADO") && (d.getCodigo().equals(filtroIntroducido)))) {
              resultados = true;              
              System.out.println("\n██████████████████████████████████████████████████\n");
              System.out.println(d);
              System.out.println("\n██████████████████████████████████████████████████\n");
            }
          } 
          
          salir = true;
          break;
        case 2:
          for (Disco d : discos) {
            if ((d != null) && (d.getEstado().equals("OCUPADO") && (d.getNombre().equals(filtroIntroducido)))) {
              resultados = true;
              System.out.println("\n██████████████████████████████████████████████████\n");
              System.out.println(d);
              System.out.println("\n██████████████████████████████████████████████████\n");
            }
          } 
          
          salir = true;
          break;
        case 3:
          for (Disco d : discos) {
            if ((d != null) && (d.getEstado().equals("OCUPADO") && (d.getAlbum().equals(filtroIntroducido)))) {
              resultados = true;              
              System.out.println("\n██████████████████████████████████████████████████\n");
              System.out.println(d);
              System.out.println("\n██████████████████████████████████████████████████\n");
            }
          } 
          
          salir = true;
          break;
        case 4:
          for (Disco d : discos) {
            if ((d != null) && (d.getEstado().equals("OCUPADO") && (d.getAnoLanzamiento().equals(filtroIntroducido)))) {
              resultados = true;              
              System.out.println("\n██████████████████████████████████████████████████\n");
              System.out.println(d);
              System.out.println("\n██████████████████████████████████████████████████\n");
            }
          } 
          
          salir = true;
          break;
        case 5:
          for (Disco d : discos) {
            if ((d != null) && (d.getEstado().equals("OCUPADO") && (d.getEdicion().equals(filtroIntroducido)))) {
              resultados = true;              
              System.out.println("\n██████████████████████████████████████████████████\n");
              System.out.println(d);
              System.out.println("\n██████████████████████████████████████████████████\n");
            }
          } 
          
          salir = true;
          break;
        case 6:
          for (Disco d : discos) {
            if ((d != null) && (d.getEstado().equals("OCUPADO") && (d.getFormato().equals(filtroIntroducido)))) {
              resultados = true;              
              System.out.println("\n██████████████████████████████████████████████████\n");
              System.out.println(d);
              System.out.println("\n██████████████████████████████████████████████████\n");
            }
          } 
          
          salir = true;
          break;
        case 7:
          salir = true;
          break;
        default:
          System.out.println("Opción incorrecta. Por favor introduzca una "
                  + "nueva opción.");
      }
    }// while
    
    if (!resultados) {
      System.out.println("No se encontraron coincidencias respecto al filtro "
              + "introducido");
    }
  }
  
  private static boolean compruebaExistencia(Disco[] discos, String codigoReferencia) {
    
    for (int i = 0; i < discos.length; i++){
      if ((discos[i] != null) && (discos[i].getCodigo().equals(codigoReferencia))) {
        return true;
      }
    }

    return false;
  }
    
  @Override
  public String toString() {
    return "Código: " + this.codigo + "\nNombre del disco: " + this.nombre + "\nAlbum: " + 
            this.album + "\nAño de Lanzamiento: " + this.anoLanzamiento + "\nEdición: " + 
            this.edicion + "\nTipo de formato: " + this.formato;
  }
  
  
  
  
}
