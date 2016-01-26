<%-- 
    Document   : Ejer7
    Created on : 22-ene-2016, 12:21:57
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 7 - Conversores</title>
    <style>
      body {
        background-color: #7d7dfd;
      }

      table {
        text-align: center;
        background-color: #c9c9c9;
        margin: auto;
        margin-top: 35px;
        height: 350px;
        width: 35%;
      }
    </style>
  </head>
  <body>
    <table>
      <tr>
        <td>
          <% 
            double valorConversion = 0;
            String opcionOrigen;
            String simbolo;
            
            
            if ((request.getParameter("opcion")).equals("euros")) {
              valorConversion = (Double.parseDouble(request.getParameter("cantidad")))*166.386;
              opcionOrigen = "pesetas";
              simbolo = "€";
            } else {
              valorConversion = (Double.parseDouble(request.getParameter("cantidad")))/166.386;
              opcionOrigen = "euros";
              simbolo = "pesetas";
            }
            
            out.print("<tr><td>Su conversion de " + opcionOrigen + " a " + request.getParameter("opcion") + " es: " + valorConversion + simbolo + "</td></tr>");
          %>
    </table>
  </body>
</html>
