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
<body style="background: url(./images/viagem.jpg) no-repeat;">

<h1> Escolha seu Hotel</h1>
<hr/>
<h2>Olá <c:out value="${User.nome}"/>
(<c:out value= "${User.email}"/>), <br>Seja bem vindo! <br>
</h2>
<hr>

<h2>Selecione a classificação do hotel que você deseja:</h2>

<div class="formulario">
<form action="escolherHotel" method="get">
<select  name ="selectClassif">
	<option value=1>1 Estrela </option>
	<option value=2>2 Estrelas </option>
	<option value=3>3 Estrelas </option>
	<option value=4>4 Estrelas </option>
	<option value=5>5 Estrelas </option>
</select>
<br>
<input class="botao-escolher"  type="submit" value="Escolher">

</form>

</div>


</body>
</html>