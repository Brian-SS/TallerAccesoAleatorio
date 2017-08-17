<%-- 
 *  TALLER ARCHIVOS ACCESO ALEATORIO
 *   co-Author ::: Juan Albarracin
 *   co-Author ::: Mario Bolaños
 *   co-Author ::: Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> - SCHEMA - </title>
    </head>
    <body>
        <center>
            <h1>Hello World!</h1>
            <form action="ControladorSchema" method="POST"></form>
            <%= modelo.Schema.saludar() %>
            
            <a href="index.jsp"><input type="button" value="INICIO" name="schemaReturn" style="font-size:22px;"/></a>
            <div style="position: absolute; bottom: 5px; width:1350px; margin:0 auto;">Copyright © 2017 - METAMODEL S.A. - Todos los derechos reservados.</div>
        </center>
    </body>
</html>
