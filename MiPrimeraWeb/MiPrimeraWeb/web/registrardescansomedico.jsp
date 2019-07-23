<%-- 
    Document   : registrardescansomedico
    Created on : 24/01/2018, 07:43:58 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Descanso Medico</title>
    </head>
    <body>
    <center>
        <h1>Formulario de registro de Descanso Medico</h1>
        <form method="post" action="control" target="resultado">
            <table border="1">
                <th colspan="2">Nuevo Descanso Medico</th>
                <tr><td>Codigo Trabajador:</td>
                    
                    <td><input type="text"  name="idtrabajador" required readonly value="<%=request.getAttribute("id")  %>"></td>
                </tr>
                <tr><td>Fecha Inicio:</td>
                    <td><input type="date" name="fecini" step="1" min="1950-01-01" max="2030-12-31" value="2018-01-01" ></td>
                </tr>
                <tr><td>Fecha Fin:</td>
                    <td><input type="date" name="fecfin" step="1" min="1950-01-01" max="2030-12-31" value="2018-01-01" ></td>
                </tr>
                <tr><td>Diagnostico:</td>
                    <td><input type="text" name="diagnostico" required></td>
                </tr>
                <tr><td>Centro Medico:</td>
                    <td><input type="text" name="cmedico" required></td>
                </tr>
                <tr><td>Medico:</td>
                    <td><input type="text" name="nmedico" required></td>
                </tr>
                <tr><td>CMP</td>
                    <td><input type="text" maxlength="6" name="cmp" required></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Registrar DM"></td>
                </tr>
            </table>
            <input type="hidden" value="3" name="res">
        </form>
        <br>
        <a href="index.html">Volver al indice</a>
        <br>
    </center>
    </body>
</html>
