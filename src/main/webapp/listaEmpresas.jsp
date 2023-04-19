
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.List , com.alura.gerenciador.servlet.Empresa"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Lista de empresas <br/>
		
	<ul>
		<c:forEach items = "${empresas}" var= "empresa">
			
			<li>${empresa.nombre }- <fmt:formatDate value="${empresa.fechaAbertura }" pattern="dd/MM/yyyy"/></li>
		</c:forEach>
	</ul>	
		
   
		
		</body>
</html>