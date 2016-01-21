<%-- 
    Document   : Ejer4
    Created on : 21-ene-2016, 8:48:54
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
    </br>
    <h3>¡La media de sus notas es
      <% out.print((Double.parseDouble(request.getParameter("nota1"))+Double.parseDouble(request.getParameter("nota2"))
        +Double.parseDouble(request.getParameter("nota3")))/3); %>!</h3>
  </body>
</html>
