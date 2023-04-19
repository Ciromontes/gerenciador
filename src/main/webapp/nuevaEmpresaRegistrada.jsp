 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
	<body>
	
		<c:if test="${not empty empresa }">
			Empresa ${ empresa } registrada!
		</c:if>
		<c:if test="${ empty empresa }">
			Ninguna empresa registrada
		</c:if>
	

	
</body>

</html>