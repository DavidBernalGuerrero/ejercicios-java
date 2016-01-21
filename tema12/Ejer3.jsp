<%-- Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola” seguido del
nombre introducido. El nombre se deberá recoger mediante un formulario. --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio JSP - Ejercicio 3 - JSP</title>
  </head>
  <body>
    <%  request.setCharacterEncoding("UTF-8"); 
        out.println("<h3>¡Hola " + request.getParameter("nombre") + ", buenos días!" + "</h3>");
        out.println("<h3 style=\"text-align: center;\">¡Bienvenido!</h3>"); 
    %>
  </body>
</html>
