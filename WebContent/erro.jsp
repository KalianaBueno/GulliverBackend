<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    <jsp:useBean id="Mensagem" type="java.lang.String" scope="request" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<link rel="stylesheet" href="style.css"> 

<title>.: Erro :.</title>
</head>
<body>

<div class="erro">
<h1> Erro!</h1>
<hr>
Mensagem de Erro: <c:out value="${Mensagem}" />
<br>
<a href="./index.jsp"> Voltar ao início</a>

</div> 


</body>
</html>