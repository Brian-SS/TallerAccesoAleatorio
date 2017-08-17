<%-- 
 *  TALLER ARCHIVOS ACCESO ALEATORIO
 *  co-Author ::: Juan Albarracin
 *  co-Author ::: Mario Bolaños
 *  co-Author ::: Brian Sterling
 *  Professor ::: Fabian Giraldo
 *    Program ::: Bases de Datos
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>METAMODEL S.A.</title>
    </head>
    <body>
        <center>
            <img src="METAMODEL.png" alt="Mountain View" style="width:204px;height:128px;">
            <br></br>
            <h1>BIENVENIDOS</h1>
            <br></br>
            <table>
                <tr>
                    <th><a href="Esquema.jsp"><input type="button" value="SCHEMA" name="schemaButton" style="font-size:22px; width:97%; height:50px;"/></a></th>
                    <th><a href="Tabla.jsp"><input type="button" value="TABLE" name="tableButton"/></a></th>
                    <th><a href="Columna.jsp"><input type="button" value="COLUMN" name="columnButton"/></a></th>
                </tr>
            </table>
            <br></br>
            <br></br>
            <div style="position: relative; bottom: 5px;">Copyright © 2017 METAMODEL S.A. - Todos los derechos reservados.</div>
        </center>    
    </body>
</html>