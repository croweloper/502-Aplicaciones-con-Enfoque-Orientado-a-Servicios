
package com.empresa.proyecto.controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ClienteServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Gson gson= new Gson();
        String jsonString =gson.toJson(listarPaises());
        response.setContentType("application/json");
        response.getWriter().write(jsonString);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombPais=request.getParameter("nomPais");
        
        nuevoPais(nombPais);
        
        response.setContentType("text/plain");
        response.getWriter().write("Datos Ingresados");
        
        
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

    private static String nuevoPais(java.lang.String nombPais) {
        com.empresa.proyecto.ws1.WS101_Service service = new com.empresa.proyecto.ws1.WS101_Service();
        com.empresa.proyecto.ws1.WS101 port = service.getWS101Port();
        return port.nuevoPais(nombPais);
    }

    private static java.util.List<com.empresa.proyecto.ws1.PaisBean> listarPaises() {
        com.empresa.proyecto.ws1.WS101_Service service = new com.empresa.proyecto.ws1.WS101_Service();
        com.empresa.proyecto.ws1.WS101 port = service.getWS101Port();
        return port.listarPaises();
    }

}
