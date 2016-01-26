

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 8 - </title>
  </head>
  <body>
    <table>
    <% 
      int numIntroducido = 0;
      
      for (int multiplicador = 0; multiplicador <= 10; multiplicador++){
        out.print("<tr><td>" + numIntroducido + " por " + multiplicador + " = <td>");
        out.print("<td>" + numIntroducido*multiplicador +"<td></tr");
      }
    %>
    </table>
  </body>
</html>
