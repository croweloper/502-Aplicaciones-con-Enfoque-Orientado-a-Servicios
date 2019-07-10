/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.globalchef.servlet;

import com.croweloper.globalchef.dao.impl.ChefDAOImpl;

import com.croweloper.globalchef.model.Chef;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author crowe
 */
public class ChefServlet extends HttpServlet {

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
            out.println("<title>Servlet ChefServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ChefServlet at " + request.getContextPath() + "</h1>");

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
        //processRequest(request, response);
        try {
            int val = Integer.parseInt(request.getParameter("val"));

            if (val == 0) {

                HttpSession session = request.getSession(false);
                session.invalidate();
                response.sendRedirect("index.html");

            }
        } catch (Exception e) {
        }

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

        int accion = Integer.parseInt(request.getParameter("accion"));

        if (accion == 1) {
            try {

                ChefDAOImpl objchef = new ChefDAOImpl();
                String mail = request.getParameter("chef_mail");
                String pass = request.getParameter("chef_pass");
                System.out.println(mail + " " + pass);

                Chef chef = objchef.Login(mail, pass);

                HttpSession session = request.getSession(true);
                System.out.println(chef.getChef_nombre());

                session.setAttribute("chefnom", chef.getChef_nombre());
                session.setAttribute("chefape", chef.getChef_apellido());

                session.setAttribute("chefmail", chef.getChef_correo());
                session.setAttribute("chefid", chef.getChef_id());
                /*
                session.setAttribute("chefpass",chef.getChef_contraseña());
                session.setAttribute("cheffoto",chef.getChef_foto());
                session.setAttribute("chefpais",chef.getChef_paisid());
                session.setAttribute("chefdescrip",chef.getChef_descripcion());
                session.setAttribute("chefseguidores",chef.getChef_cantseguidores());
                session.setAttribute("chefrecetas",chef.getChef_cantrecetas());*/
                //processRequest(request, response);
                response.sendRedirect("wall.jsp");

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

}
