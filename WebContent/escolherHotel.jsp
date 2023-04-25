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


<title>.: Confira seus Hotéis .:</title>
</head>
<body style="background: url(./images/viagem.jpg) no-repeat;" >

<h1>Olha o que encontramos para você <c:out value="${User.nome}"/>!</h1>

<p> Os Hotéis da categoria selecionada são:</p>




<c:forEach items="${listaHoteis}" var="hotel">

<div class="card">

	Hotel <c:out value="${hotel.nome}"/> <br>
	Endereço: <c:out value="${hotel.endereco}"/><br>
	Valor da Diária:
			<c:out value="${hotel.valorDiaria}"/> <br>
	Classificação:
			<c:out value="${hotel.classificacao}"/> estrelas <br>

</div>

</c:forEach>



</body>
</html>