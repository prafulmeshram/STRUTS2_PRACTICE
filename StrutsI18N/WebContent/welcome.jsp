<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<s:head />
<body>
	<h1>Registered User</h1>
	<s:label value="First Name"></s:label>: 
	<s:property value="firstName" />
	<br />
	<s:label value="Last Name"></s:label>:
	<s:property value="lastName" />
	<br />
	<s:label value="Gender"></s:label>:
	<s:property value="gender" />
	<br />
	<s:label value="Age"></s:label>:
	<s:property value="age" />
	<br />
	<s:label value="DOB"></s:label>:
	<s:property value="dob" />
	<br />
	<s:label value="Email Id"></s:label>:
	<s:property value="email" />
	<br />

</body>
</html>