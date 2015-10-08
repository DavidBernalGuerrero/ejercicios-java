/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 *nacimiento.
 *
 * @author David Bernal Guerrero
 */

  public class T4E10PideDiaMesPresentaHoroscopo {
    public static void main(String[] args) {

      System.out.print("Dinos tu día y tu mes de nacimiento y te diremos tu " +
        "horoscopo. \nEmpecemos por el día de nacimiento: ");
      int dia = Integer.parseInt(System.console().readLine());

      System.out.print("Ahora dinos el mes de nacimiento: ");
      String mes = (System.console().readLine()).toLowerCase();;

      String horoscopo = "";

      if ((dia > 0) && (dia <= 31)) {
        switch (mes) {

          case "enero":
            if (dia <= 21) {
              horoscopo = "Capricornio";
            } else {
              horoscopo = "Acuario";
            }
            break;
          case "febrero":
            if ((dia >= 1) && (dia <= 29)) {
              if (dia <= 21) {
                horoscopo = "Acuario";
              } else {
                horoscopo = "Piscis";
              }
            } else {
              horoscopo = "erroneo";
              System.out.print("El dia introducido no es correcto.");
            }
            break;
          case "marzo":
            if (dia <= 20) {
              horoscopo = "Piscis";
            } else {
              horoscopo = "Aries";
            }
            break;
          case "abril":
            if ((dia >= 1) && (dia <= 30)) {
              if (dia <= 20) {
                horoscopo = "Aries";
              } else {
                horoscopo = "Tauro";
              }
            } else {
              horoscopo = "erroneo";
              System.out.print("El dia introducido no es correcto.");
            }
            break;
          case "mayo":
            if (dia <= 21) {
              horoscopo = "Tauro";
            } else {
              horoscopo = "Géminis";
            }
            break;
          case "junio":
            if ((dia >= 1) && (dia <= 30)) {
              if (dia <= 21) {
                horoscopo = "Géminis";
              } else {
                horoscopo = "Cáncer";
              }
            } else {
              horoscopo = "erroneo";
              System.out.print("El dia introducido no es correcto.");
            }
            break;
          case "julio":
            if (dia <= 22) {
              horoscopo = "Cáncer";
            } else {
              horoscopo = "Leo";
            }
            break;
          case "agosto":
            if (dia <= 22) {
              horoscopo = "Leo";
            } else {
              horoscopo = "Virgo";
            }
            break;
          case "septiembre":
            if ((dia >= 1) && (dia <= 30)) {
              if (dia <= 22) {
                horoscopo = "Virgo";
              } else {
                horoscopo = "Libra";
              }
            } else {
              horoscopo = "erroneo";
              System.out.print("El dia introducido no es correcto.");
            }
            break;
          case "octubre":
            if (dia <= 22) {
              horoscopo = "Libra";
            } else {
              horoscopo = "Escorpio";
            }
            break;
          case "noviembre":
            if ((dia >= 1) && (dia <= 30)) {
              if (dia <= 21) {
                horoscopo = "Escorpio";
              } else {
                horoscopo = "Sagitario";
              }
            } else {
              horoscopo = "erroneo";
              System.out.print("El dia introducido no es correcto.");
            }
            break;
          case "diciembre":
            if (dia <= 21) {
              horoscopo = "Sagitario";
            } else {
              horoscopo = "Capricornio";
            }
            break;
          default:
            System.out.print("El mes introducido no es correcto.");
            horoscopo = "erroneo";
        }
        if (horoscopo != "erroneo") {
          System.out.print("Su horoscopo es: " + horoscopo);
        }
      } else {
        System.out.print("El dia introducido no es correcto.");
      }
    }
  }
