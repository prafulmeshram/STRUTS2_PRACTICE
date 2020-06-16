<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>

	<%
		if (session.getAttribute("loggedUser") == null) {
			response.sendRedirect("index.jsp");
		}
	%>

	<ul>
		<li><a href="welcome">Home</a></li>
		<li><a href="registerForm">Register Product</a></li>
		<li style="float: right;"><a href="logout">Logout</a></li>

	</ul>
</body>
</html>