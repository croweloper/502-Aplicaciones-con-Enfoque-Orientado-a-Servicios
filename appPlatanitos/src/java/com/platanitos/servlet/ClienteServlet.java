/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platanitos.servlet;

import com.platanitos.wsdl.Cliente;
import com.platanitos.wsdl.SwCliente_Service;
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
public class ClienteServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/env-8024082.users.scale.virtualcloud.com.br/swplatanitos/swCliente.wsdl")
    private SwCliente_Service service;

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClienteServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClienteServlet at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        String accion = request.getParameter("accion");

        if (accion.equals("login")) {
            try {

                //ChefDAOImpl objchef = new ChefDAOImpl();
                String mail = request.getParameter("email");
                String pass = request.getParameter("password");

                System.out.println(mail + " " + pass);

                Cliente cliente = login(mail, pass);

                if (cliente != null) {
                    
                    HttpSession session = request.getSession(true);
                    System.out.println(cliente.getNombres());

                    session.setAttribute("clinom", cliente.getNombres());
                    session.setAttribute("cliape", cliente.getApellidos());

                    session.setAttribute("cliid", cliente.getIdCliente());
                    session.setAttribute("clidni", cliente.getDNI());

                    
                    response.sendRedirect("index.jsp?id=2&nombre="+cliente.getNombres());
                } else {
                    response.sendRedirect("index.jsp?id=1");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
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

    private Cliente login(java.lang.String mail, java.lang.String pass) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.platanitos.wsdl.SwCliente port = service.getSwClientePort();
        return port.login(mail, pass);
    }

    private Cliente registrar(com.platanitos.wsdl.Cliente cliente) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.platanitos.wsdl.SwCliente port = service.getSwClientePort();
        return port.registrar(cliente);
    }

    private int validarDNIandMail(java.lang.String dni, java.lang.String mail) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.platanitos.wsdl.SwCliente port = service.getSwClientePort();
        return port.validarDNIandMail(dni, mail);
    }

}
