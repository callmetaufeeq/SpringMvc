<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cources</title>
</head>
<body>

	<h4>Hi ${name} and Date : ${date}</h4>
	<p />
	<hr />


<ul>
		<c:forEach var="temp" items="${cources}">
			<li>${temp}</li>

		</c:forEach>

	</ul>

</body>
</html>