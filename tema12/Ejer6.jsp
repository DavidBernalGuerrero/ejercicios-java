<%-- 
    Document   : Ejer6
    Created on : 21-ene-2016, 9:52:55
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 6 - Conversor Pesetas a Euros</title>
  </head>
  <body>
    <h1>¡La conversión de
      
      <% double pesetas = Double.parseDouble(request.getParameter("pesetas"));
        out.print(pesetas + " pesetas a euros es: " + (pesetas)/166.386); %>€!</h1>
  </body>
</html>
