<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Registered User</h1>

	<table border="1">
		<tr>
			<th>First Name</th>
			<td><s:property value="firstName" /></td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td><s:property value="lastName" /></td>
		</tr>
		<tr>
			<th>Email</th>
			<td><s:property value="email" /></td>
		</tr>
		<tr>
			<th>Password</th>
			<td><s:property value="password" /></td>
		</tr>
		<tr>
			<th>DOB</th>
			<td><s:property value="dob" /></td>
		</tr>
		<tr>
			<th>Age</th>
			<td><s:property value="age" /></td>
		</tr>
		<tr>
			<th>Gender</th>
			<td><s:property value="gender" /></td>
		</tr>
		<tr>
			<th>Country</th>
			<td><s:property value="country" /></td>
		</tr>
		<tr>
			<th>Hobbies</th>
			<td><s:property value="hobbies" /></td>
		</tr>

	</table>

</body>
</html>