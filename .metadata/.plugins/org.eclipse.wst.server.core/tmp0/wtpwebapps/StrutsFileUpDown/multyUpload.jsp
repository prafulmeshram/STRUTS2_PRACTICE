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
	<h2>Struts2 MUltiple File Upload Example</h2>
	User Image:

	<br />

	<s:iterator var="name" value="uploadFileName">
		<table id="table-1">
			<tr>
				<td><s:property value="name" /></td>
				<td><img src="<s:property value="name"/>" /></td>
			</tr>
		</table>

	</s:iterator>


</body>
</html>