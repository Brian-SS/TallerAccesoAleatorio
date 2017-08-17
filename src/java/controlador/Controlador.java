/*
 *  TALLER ARCHIVOS ACCESO ALEATORIO
 *   co-Author ::: Juan Albarracin
 *   co-Author ::: Mario Bolaños
 *   co-Author ::: Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Saludo;

/**
 *
 * @author Labing I5
 */
public class Controlador extends HttpServlet
{
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String variable = request.getParameter("saludo");
        //Verificacion
        if (variable != null)
        {
            //Logica De negocio 
            Saludo saludo = new Saludo();
            String respuesta = saludo.saludar(variable);
            ArrayList<String> array = saludo.listar();
            //la variable que permite hacer el forward
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
            //Envio de datos entre: Servlet - jsp
            request.setAttribute("respuesta", respuesta);
            request.setAttribute("array", array);
            rd.forward(request, response);
        }
        else
        {
            //Mandar Mensaje de Error
            response.sendRedirect("/index.jsp");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}