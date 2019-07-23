<%-- 
    Document   : registrousuario1
    Created on : 10/01/2018, 09:48:57 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuarios</title>
    </head>
    <body>
        
        
        <h1>Formulario de registro</h1>
        <form method="post" action="control" target="resultado">
            <table border="1">
                <th colspan="2">Datos personales</th>
                <tr><td>Nombre:</td>
                    <td><input type="text" name="nombre" required></td>
                </tr>
                <tr><td>Apellido:</td>
                    <td><input type="text" name="apellido" required></td>
                </tr>
                <tr><td>Fecha Nac</td>
                    <td><input type="date" name="fechanac" step="1" min="1950-01-01" max="2000-12-31" value="1980-01-01" ></td>
                </tr>
                <tr><td>Dirección:</td>
                    <td><input type="text" name="direccion" required></td>
                </tr>
                <tr><td>Sexo:</td>
                    <td>
                        <select name="sexo">
                            <option value="M">Masculino</option>
                            <option value="F">Femenino</option>
                        </select>
                    </td>
                </tr>
                <tr><td>DNI:</td>
                    <td><input type="text" name="doc" required></td>
                </tr>
                <tr><td>Estado Civil:</td>
                     <td>
                         <select name="ecivil">
                            <option value="S">Soltero</option>
                            <option value="C">Casado</option>
                            <option value="O">Conviviente</option>
                            <option value="V">Viudo</option>
                            <option value="D">Divorsiado/Separado</option>
                        </select>
                     </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit"></td>
                </tr>
            </table>
            <input type="hidden" value="1" name="res">
        </form>
        <br>
        <a href="index.html">Volver al indice</a>
        <br>
        
    </body>
</html>

