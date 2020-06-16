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

	<s:url action="changeLocale" var="urlEn">
		<s:param name="request_locale">en</s:param>
	</s:url>

	<s:url action="changeLocale" var="urlFr">
		<s:param name="request_locale">fr</s:param>
	</s:url>


	<a href="${urlEn }">English</a>
	<a href="${urlFr }">French</a>


	<s:form action="RegisterAction" method="post">


		<s:textfield name="firstName" key="global.firstname.label"
			placeholder="%{getText('global.firstname.placeholder')}" />

		<s:textfield name="lastName" key="global.lastname.label"
			placeholder="%{getText('global.lastname.placeholder')}" />

		<s:radio name="gender" list="{'Male', 'Female'}"
			key="global.gender.label" />

		<s:textfield name="age" key="global.age.label" placeholder="%{getText('global.age.placeholder')}" />

		<sx:datetimepicker name="dob" key="global.dob.label"
			displayFormat="dd-MMM-yyyy" />

		<s:textfield name="email" key="global.email.label"
			placeholder="%{getText('global.email.placeholder')}" />

		<s:reset key="global.reset"></s:reset>
		<s:submit key="global.submit"></s:submit>
	</s:form>
</body>
</html>