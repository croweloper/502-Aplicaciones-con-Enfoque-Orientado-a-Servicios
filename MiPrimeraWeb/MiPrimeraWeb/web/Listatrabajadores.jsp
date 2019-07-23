<%--
    Document   : Listatrabajadores
    Created on : 20/12/2017, 08:27:44 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.TrabajadorDAO, java.util.*, modelo.Trabajador" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Trabajadores</title>
        <%
                        List<Trabajador> listatrab;
                        listatrab=TrabajadorDAO.listar_trabajadores();
                        
         %>
    </head>
    <body>
    <center>
       
        <h1>Trabajadores</h1>
        
        <table border="2" align="center">
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                    <th>Fec nac</th>
                    <th>Direccion</th>
                    <th>Sexo</th>
                    <th>DNI</th>
                    <th>Estado</th>
                    <th>Descansos</th>
                    <%
                        
                        for (int i = 0; i < listatrab.size(); i++) {
                        out.println("<tr>");
                        out.println("<td>"+listatrab.get(i).getIdTra()+"</td>");
                        out.println("<td>"+listatrab.get(i).getNomTra()+"</td>");
                        out.println("<td>"+listatrab.get(i).getApeTra()+"</td>");
                        out.println("<td>"+listatrab.get(i).getDniTra()+"</td>");
                        out.println("<td>"+listatrab.get(i).getDirecTra()+"</td>");
                        out.println("<td>"+listatrab.get(i).getEstcivTra()+"</td>");
                        out.println("<td>"+listatrab.get(i).getFnacTra()+"</td>");
                        out.println("<td>"+listatrab.get(i).getSexoTra()+"</td>");
                        
                        
                    %>
                    
                    <td><a href="control?res=2&idtra=<%=listatrab.get(i).getIdTra()%>">Registrar</a></td>

                    <%
                    out.print("</tr>");
                         }
                     %>
                            
        </table>    
    </center>
    </body>
</html>
