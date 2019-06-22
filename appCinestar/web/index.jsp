<%-- 
    Document   : index
    Created on : 12-jun-2019, 20:44:11
    Author     : crowe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta name="description" content="Multicines Cinestar es una empresa pionera en el formato de multicines en el Perú. Información de películas, estrenos, concursos y más">
        <link rel="shortcut icon" href="img/varios/favicon.ico">
        <link href="css/estilos.css" rel="stylesheet" type="text/css">
        <title>Multicines Cinestar</title>
    </head>
    <body>
        <%@include file="WEB-INF/header.jspf" %>
        <div class="contenido">
            <div class="publicidad">
                    <a href="http://www.cinestar.com.pe/starcard/"><img src="img/varios/starcard.jpg"></a>
                    <a href="http://www.cinestar.com.pe/cinefilo_star/"><img src="img/varios/cinefilo-star.jpg"></a>
            </div>
            <div class="contenido-interno">
                <%Object id=session.getAttribute("id");
                if (id==null) { %>
                <%@include file="WEB-INF/inicio.jspf" %>
                <% } else if(id.equals("1") || id.equals("2")){ %>
                    <%@include file="WEB-INF/verPeliculas.jspf" %>
                <% } else if(id.equals("3")){ %>
                    <%@include file="WEB-INF/verPelicula.jspf" %> 
                <% } else if(id.equals("4")){ %>
                    <%@include file="WEB-INF/verCines.jspf" %>    
                <% } else if(id.equals("5")){ %>
                    <%@include file="WEB-INF/verCine.jspf" %>
                <%}%>
            </div>
        </div>
        <%@include file="WEB-INF/footer.jspf" %>
    </body>
</html>
