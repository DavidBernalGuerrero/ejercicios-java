<%-- 
    Document   : Ejer5
    Created on : 21-ene-2016, 9:27:22
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>¡La conversión de
      
      <% double euros = Double.parseDouble(request.getParameter("euros"));
        out.print(euros + "€ a pesetas es: " + (euros)*166.386); %>!</h1>
  </body>
</html>
