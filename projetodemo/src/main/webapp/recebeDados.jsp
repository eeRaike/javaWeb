<%-- 
    Document   : recebeDados
    Created on : 3 de dez. de 2024, 10:13:18
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dados recebidos da página HTML</title>
    </head>
    <body>
        <h1>Dados recebidos...</h1>
        <%
        
            String nomeDigitado = request.getParameter("nome");
            String emailDigitado = request.getParameter("email");
            out.println(nomeDigitado);
            out.println(emailDigitado);

        %>
    </body>
</html>
