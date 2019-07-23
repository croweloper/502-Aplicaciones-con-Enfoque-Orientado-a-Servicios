<%-- 
    Document   : consultaTrabajado
    Created on : 14/12/2017, 07:15:18 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Trabajador</title>
    </head>
    <body>
        <h1> Consulta de Trabajador</h1>
        
        <br>
        <form method="post" action="control" target="salidaconsulta">
            <table border="1">
                <th colspan="2">Datos personales</th>
                <tr>
                    <td>id :</td>
                    <td><input type="text" name="idtra"></td>
                </tr>
                <tr>
                    <td>Nombre :</td>
                    <td><input type="text" name="nomtra"></td>
                </tr>
                <tr>
                    <td>Apellidos :</td>
                    <td><input type="text" name="apetra"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Consultar"></td>
                </tr>
            </table>
            
        </form>
        <br>
        <br>
        <iframe name="salidaconsulta" width="900" height="350"></iframe>
        
    </body>
</html>
