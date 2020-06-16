<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title"></tiles:insertAttribute>
</title>

<link type="text/css" rel="stylesheet"
	href="assets/bootstrap-4.4.1-dist/css/bootstrap.min.css" />
<link type="text/css" rel="stylesheet" href="assets/css/style.css" />
<link type="text/css" rel="stylesheet"
	href="assets/fontawesome-free-5.13.0-web/css/all.min.css" />
</head>
<body>

	<tiles:insertAttribute name="header"></tiles:insertAttribute>
	<tiles:insertAttribute name="body"></tiles:insertAttribute>
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>

	<!-- <script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> -->

	<script type="text/javascript" src="assets/js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript"
		src="assets/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="assets/fontawesome-free-5.13.0-web/js/all.min.js"></script>
</body>
</html>