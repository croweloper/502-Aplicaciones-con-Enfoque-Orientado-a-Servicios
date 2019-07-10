/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.globalchef.servlet;

//import com.croweloper.globalchef.ws.SwUsuario_Service;
import com.croweloper.globalchef.ws.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author crowe
 */
public class UsuarioServlet extends HttpServlet {

    //@WebServiceRef(wsdlLocation = "WEB-INF/wsdl/env-1403880.jelastic.saveincloud.net/serviciosweb/swUsuario.wsdl")
    //private SwUsuario_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession misession= (HttpSession) request.getSession();
        
        response.setContentType("text/html;charset=UTF-8");
        
        String nomusu=(String)misession.getAttribute("nomusu");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsuarioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Nombre de Usuairo : Daniel</h1>");
            out.println("<h1>Nombre de Usuairo " + nomusu + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        int accion=Integer.parseInt(request.getParameter("accion"));
        
        if (accion==1) {
            try {
                String mail=request.getParameter("chef_mail");
                String pass=request.getParameter("chef_pass");
                
                Usuario usuario= login(mail, pass);
                                
                HttpSession session = request.getSession(true);
                System.out.println(usuario.getUsuNombre());
                session.setAttribute("usunom",usuario.getUsuNombre());
                session.setAttribute("usuape",usuario.getUsuApellido());
                session.setAttribute("usumail",usuario.getUsuCorreo());
                session.setAttribute("usuid",usuario.getUsuId());
                session.setAttribute("usupais",usuario.getUsuPaisid());
                session.setAttribute("usufoto",usuario.getUsuFoto());
                session.setAttribute("usufono",usuario.getUsuTelefono());
                session.setAttribute("usudoc",usuario.getUsuDocumento());
                response.sendRedirect("wall.jsp");
                
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        
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
    

    private Usuario login(java.lang.String mail, java.lang.String pass) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.croweloper.globalchef.ws.SwUsuario_Service service=new com.croweloper.globalchef.ws.SwUsuario_Service();
        com.croweloper.globalchef.ws.SwUsuario port = service.getSwUsuarioPort();
        return port.login(mail, pass);
    }

}
