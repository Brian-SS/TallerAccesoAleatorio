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
            <h1>Seccion</h1>
            <h2> - SCHEMA - </h2>
            <form action="ControladorSchema" method="POST"></form>
            <form>
                First name:<input type="text" name="firstname">
                <br>
                Last name: <input type="text" name="lastname">
            </form> 
            
            
            <%= modelo.Schema.saludar() %>
            
            
            <%
                String respuesta = (String) request.getAttribute("respuesta");
                
                if (respuesta != null && respuesta.length() > 0) 
                {
            %>
            <h1><%=respuesta%></h1>
            <%
                }
            %>
            <%--Action: URL del Servlet --%>
            <form action="ControladorSchema" method="POST"></form>
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
            <a href="index.jsp"><input type="button" value="INICIO" name="schemaReturn" style="font-size:22px;"/></a>

            <div style="position: absolute; bottom: 5px;">
                Copyright © 2017 - METAMODEL S.A. - Todos los derechos reservados.
            </div>
        </center>
    </body>
</html>
1
2









