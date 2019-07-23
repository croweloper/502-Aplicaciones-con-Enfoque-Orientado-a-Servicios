<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>Formulario de registro</h1>
        <form method="post" action="control" target="resultado">
            <table border="1">
                <th colspan="2">Datos personales</th>
                <tr>
                    <td>Número 1:</td>
                    <td><input type="number" name="n1"></td>
                </tr>
                <tr><td>Número 2:</td>
                    <td><input type="number" name="n2"></td>
                </tr>
                <tr><td>Operación:</td>
                    <td><input type="text" name="opera"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit"></td>
                </tr>
            </table>
        </form>
        <br>
        <a href="index.html">Volver al indice</a>
        <br>
        <br>
        <iframe name="resultado" width="300" height="350"></iframe>
    </body>
</html>
