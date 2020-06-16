<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style type="text/css">
.center {
	margin: auto;
	width: 25%;
	border: 3px solid green;
	padding: 10px;
	background-color: lightgray;
}
</style>
</head>
<body>



	<div class="center">
		<s:if test="hasActionErrors()">
			<s:actionerror />
		</s:if>

		<s:form action="login" method="post">
			<s:textfield name="username" label="Username"
				placeholder="Enter Username" />
			<s:password name="password" label="Password"
				placeholder="Enter Password" />
			<s:submit value="LOGIN" style="float:right;" />
		</s:form>
	</div>

</body>
</html>