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
<sx:head />
<body>
	<s:form action="RegisterAction" method="post">
		<s:textfield name="firstName" label="First Name"
			placeholder="Enter First Name" />

		<s:textfield name="lastName" label="Last Name"
			placeholder="Enter Last Name" />

		<s:radio name="gender" list="{'Male', 'Female'}" label="Gender" />

		<s:textfield name="age" label="Age" placeholder="Enter Age" />

		<sx:datetimepicker name="dob" label="DOB" displayFormat="dd-MMM-yyyy" />

		<s:textfield name="email" label="Email Id"
			placeholder="Enter Email Id" />

		<s:reset value="RESET"></s:reset>
		<s:submit value="SUBMIT"></s:submit>
	</s:form>
</body>
</html>