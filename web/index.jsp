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
            <%-- <a href="Columna.jsp">Creazione Nuovo Corso</a>--%>
            <%-- <a href="Columna.jsp">Liqui<input type="button" value="Cancel" name="cancel"/></a>--%>
            <img src="METAMODEL.jpg" alt="Mountain View" style="width:304px;height:228px;">
            <table style="width:100%">
                <tr>
                    <th><a href="Esquema.jsp"><input type="button" value="SCHEMA" name="schemaButton"/></a></th>
                    <th><a href="Tabla.jsp"><input type="button" value="TABLE" name="tableButton"/></a></th>
                    <th><a href="Columna.jsp"><input type="button" value="COLUMN" name="columnButton"/></a></th>
                </tr>
            </table>
            
            
            
            
            
            <%
                String respuesta = (String) request.getAttribute("respuesta");
                if (respuesta != null && respuesta.length() > 0) 
                {
            %>
            <H1><%=respuesta%> </h1>
            <%
                }
            %>
            <%--Action: URL del Servlet --%>
            <form action="Controlador" method="POST">
                <input type="text" name="saludo"/>
                <input type="submit" name="enviar"/>
            </form>
            <%
                ArrayList<String> array = (ArrayList) request.getAttribute("array");
                if (array != null)
                {
            %>       
            <h1>Resultado Lista </h1>
            <%               
                    for (String elemento : array)
                    {
            %>
            <h2><%=elemento%>
            <%
                    }
                }
            %>
        </center>    
    </body>
</html>