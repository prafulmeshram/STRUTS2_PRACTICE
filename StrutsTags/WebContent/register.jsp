<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<sx:head />
<body>
	<s:form action="registerAction" method="post">
		<s:textfield name="firstName" label="First Name"
			placeholder="Enter First Name" />

		<s:textfield name="lastName" label="Last Name"
			placeholder="Enter Last Name" />

		<s:textfield name="email" label="Email Id"
			placeholder="Enter Email Id" />

		<s:password name="password" label="password"
			placeholder="Enter Password" />

		<sx:datetimepicker name="dob" label="D.O.B."
			displayFormat="dd-MMM-yyyy" />

		<s:textfield name="age" label="age" placeholder="Enter Age" />

		<s:radio list="genderList" name="gender" label="Gender"></s:radio>

		<s:select list="countryList" name="country" label="Country"
			headerKey="-1" headerValue="None" />

		<s:checkboxlist list="hobbyList" name="hobbies" label="Hobbies" />

		<s:reset value="RESET" />
		<s:submit value="REGISTER" />
	</s:form>
</body>
</html>