
package ArrayPOOEj05Cap09;

import java.util.Scanner;

public class Articulo {

  static Scanner s = new Scanner(System.in);
  
  private String codigo;
  private String descripcion;
  private String precioCompra;
  private String precioVenta;
  private int stock;

  public Articulo() {
    
    System.out.println("Introduzca el código del artículo: ");
    String codigo = s.nextLine();
    this.codigo = codigo;
    
    System.out.println("Introduzca una descripción del artículo: ");
    String descripcion = s.nextLine();    
    this.descripcion = descripcion;
    
    System.out.println("Introduzca el precio de Compra del artículo: ");
    String precioCompra = s.nextLine();    
    this.precioCompra = precioCompra;
    
    System.out.println("Introduzca el precio de venta del artículo: ");
    String precioVenta = s.nextLine();    
    this.precioVenta = precioVenta;
    
    System.out.println("Introduzca el stock del almacén: ");
    int stock = Integer.parseInt(s.nextLine());    
    this.stock = stock;
  }
  
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(String precioCompra) {
    this.precioCompra = precioCompra;
  }

  public String getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(String precioVenta) {
    this.precioVenta = precioVenta;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }
  
  public static void alta (Articulo[] articulos) {
    boolean anadido = false;
    
    for (int i = 0; (i < articulos.length) && (!anadido); i++) {
      if ((articulos[i] == null) && (!anadido)) {
        articulos[i] = new Articulo();
        anadido = true;
      }
    }
  }
  
  public static void baja (Articulo[] articulos) {
    boolean bajaRealizada = false;
    
    System.out.println("Indtrozca el código del artículo que desea eliminar del "
            + "almacén:");
    String codigoReferencia = s.nextLine();
    
    for (int i = 0; (i < articulos.length) && (!bajaRealizada); i++) {
      if ((articulos[i] != null) && (articulos[i].getCodigo().equals(codigoReferencia)) && (!bajaRealizada)) {
        articulos[i] = null;
        bajaRealizada = true;
      }
    }
    
    if (!bajaRealizada) {
      System.out.println("No se encuentra el código de referencia del artículo"
              + " en el almacén.");
    }
  }
  
  public static void modificacion (Articulo[] articulos) {
    System.out.println("Introduce el código del articulo que desea modificar: ");
    String referencia = s.nextLine();
    
    int opcion;
    String nuevoValor;
    boolean modificado = false;
    boolean salir = false;
    
    for (int i = 0; (i < articulos.length) && (!modificado); i++) {
      if ((articulos[i] != null) && (articulos[i].getCodigo().equals(referencia))) {
        while (!salir) {
          System.out.println("¿Qué valor desea modificar?");
          System.out.println("1. Código.");
          System.out.println("2. Descripción.");
          System.out.println("3. Precio de Compra.");
          System.out.println("4. Precio de Venta.");
          System.out.println("5. Stock del artículo.");
          System.out.println("6. Cancelar. Salir del asistente de modificación.");
          opcion = Integer.parseInt(s.nextLine());
          
          switch (opcion) {
            case 1:
              System.out.println("Nuevo valor de 'Código': ");
              nuevoValor = s.nextLine();
              articulos[i].setCodigo(nuevoValor);
              modificado = true;
              break;
            case 2:
              System.out.println("Nuevo valor de la 'Descripción': ");
              nuevoValor = s.nextLine();
              articulos[i].setDescripcion(nuevoValor);
              modificado = true;
              break;
            case 3:
              System.out.println("Nuevo valor del 'Precio de Compra': ");
              nuevoValor = s.nextLine();
              articulos[i].setPrecioCompra(nuevoValor);
              modificado = true;
              break;
            case 4:
              System.out.println("Nuevo valor del 'Precio de Venta': ");
              nuevoValor = s.nextLine();
              articulos[i].setPrecioVenta(nuevoValor);
              modificado = true;
              break;
            case 5:
              System.out.println("Nuevo valor del 'Stock': ");
              nuevoValor = s.nextLine();
              articulos[i].setStock(Integer.parseInt(nuevoValor));
              modificado = true;
              break;
            case 6:
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
      System.out.println("El artículo se ha modificado con éxito.");
    } else {
      System.out.println("No se ha encontrado ningún artículo que corresponda al "
              + "código de referencia introducido. Interrumpiendo Modificación...");
    }
  }

  public static void listado (Articulo[] articulos) {
    for (Articulo objeto : articulos) {
      if (objeto != null) {
        System.out.println(objeto);
      }
    }
  }
  
  public static void entradaMercancia (Articulo[] articulos) {
    System.out.println("Introduzca el código del artículo del cuál ha entrado "
            + "mercancía:");
    String codigoReferencia = s.nextLine();
    
    System.out.println("¿Cuánta mercancía ha entrado?: ");
    int cantidadMercancia = Integer.parseInt(s.nextLine());
    
    for (Articulo objeto : articulos) {
      if ((objeto != null) && (objeto.getCodigo().equals(codigoReferencia))) {
        objeto.setStock(objeto.getStock() + cantidadMercancia);
      }
    }
  }
  
  public static void salidaMercancia (Articulo[] articulos) {
    System.out.println("Introduzca el código del artículo del cuál ha salido "
            + "mercancía:");
    String codigoReferencia = s.nextLine();
    
    System.out.println("¿Cuánta mercancía ha salido?: ");
    int cantidadMercancia = Integer.parseInt(s.nextLine());
    
    for (Articulo objeto : articulos) {
      if ((objeto != null) && (objeto.getCodigo().equals(codigoReferencia))) {
        if ((objeto.getStock() - cantidadMercancia) < 0) {
          System.out.println("No es posible sacar más mercancia de la existente.");
        } else {
          objeto.setStock(objeto.getStock() - cantidadMercancia);
        }
      }
    }
  }
  
  @Override
  public String toString() {
    return "Código: " + this.codigo + "\nDescripción: " + this.descripcion + 
            "\nPrecio de Compra: " + this.precioCompra + "\nPrecio de Venta: " + 
            this.precioVenta + "\nStock: " + this.stock;
  }

  
}
