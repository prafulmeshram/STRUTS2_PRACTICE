<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resister</title>

<style type="text/css">
.center {
	margin: auto;
	width: 30%;
	border: 3px solid green;
	padding: 10px;
	background-color: lightgray;
}

.center1 {
	margin: auto;
	width: 30%;
	border: 3px solid red;
	padding: 10px;
	color: white;
}
</style>
</head>
<body>
	<%@ include file="header.jsp"%>

	<s:if test="hasActionErrors()">
		<div class="center1" style="margin-top: 10px;">
			<s:actionerror />
		</div>
	</s:if>
	<div class="center" style="margin-top: 10px;">
		<s:form action="productRegister" method="post">
			<s:textfield name="product.productId" label="Product Id"
				placeholder="Enter Product Id" />

			<s:textfield name="product.productName" label="Product Name"
				placeholder="Enter Product Name" />

			<s:textfield name="product.quantity" label="Quantity"
				placeholder="Enter Quantity" />

			<s:textfield name="product.category" label="Category"
				placeholder="Enter Category" />

			<s:submit value="REGISTER" style="float:right;" />
		</s:form>


	</div>

</body>
</html>