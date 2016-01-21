<%-- Mejora el programa anterior de tal forma que la apariencia de la página web que muestra
el navegador luzca más bonita mediante la utilización de CSS (utiliza siempre ficheros
independientes para CSS para no mezclarlo con HTML). --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio JSP - Ejercicio 2</title>
    <style>
      h1 {
        text-align: center;
        font-style: italic;
        font-size: 20px;
        color: gray;
      }
      h2 {
        text-align: left;
        font-style: inherit;
        font-size: 15px;
        color: blueviolet;
      }
      
    </style>
    
  </head>
  <body style="background-color: #77a9ff;">
    <div>
    <% 
      int curso = 1;
      out.print("<h1>David Bernal Guerrero</h1>"); 
      out.print("<h2>Estudiante de" + curso +"º de DAW</h2>");   
    %>
    </div>
  </body>
</html>
