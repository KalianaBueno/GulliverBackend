<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      
      <jsp:useBean id="User" type="com.gulliver.model.Usuario" scope="session" />
      
     <%@ page import = "com.gulliver.controller.ListaHoteisServlet" %>
     <%@ page import="com.gulliver.model.Hoteis"%>
     
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<link rel="stylesheet" href="style.css"> 

<title>.: Busque seu hotél pela classificação :.</title>
</head>
<body>
<h1> Escolha seu Hotel</h1>
<hr/>
Olá <c:out value="${User.nome}"/>
(<c:out value= "${User.email}"/>), <br>Seja bem vindo! <br>
<hr>

Selecione a classificação do hotel que você deseja:

<form action="escolherHotel" method="get">
<select name ="selectClassif">
	<option value=1>1 Estrela </option>
	<option value=2>2 Estrelas </option>
	<option value=3>3 Estrelas </option>
	<option value=4>4 Estrelas </option>
	<option value=5>5 Estrelas </option>
</select>
<br>
<input type="submit" value="Escolher">

</form>



</body>
</html>