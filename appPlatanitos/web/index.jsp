
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <meta charset="utf-8">
        <meta mame="viewport" content="width=device-width,user-scalable=no,initial-scale=1,maximum-scale=1,minimum-scale=1">
        <link rel="stylesheet" type="text/css" href="css/cuerpo.css"> 
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body>
        <%@include file="WEB-INF/header.jspf" %>
        <%String id = request.getParameter("id");
        //Object id = session.getAttribute("id");
            if (id == null) { %>
        <%@include file="WEB-INF/inicio.jspf" %>
        <% } else if (id.equals("1")) { %>
        <%@include file="WEB-INF/login.jspf" %>
        <% } else if (id.equals("2")) { %>
        <%@include file="WEB-INF/panelcliente.jspf" %>
        <% } else if (id.equals("9")) { %>
        <%@include file="WEB-INF/login.jspf" %>
        <script>alert("Registro Exitoso")</script>
        <% } else if (id.equals("8")) { %>
        <%@include file="WEB-INF/login.jspf" %>
        <script>alert("Correo o DNI ya existente")</script>
        <% } %>
        <%@include file="WEB-INF/footer.jspf" %>
    </body>
</html>
