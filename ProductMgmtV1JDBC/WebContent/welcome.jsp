<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>

<style type="text/css">
.center1 {
	margin: auto;
	width: 50%;
	border: 3px solid green;
	padding: 10px;
	color: white;
}

.center {
	margin: auto;
	width: 50%;
	border: 3px solid green;
	padding: 10px;
}
</style>

</head>
<body>
	<%@ include file="header.jsp"%>
	<s:if test="hasActionMessages()">
		<div class="center1">
			<s:actionmessage />
		</div>
	</s:if>

	<s:if test="hasActionErrors()">
		<div class="center1">
			<s:actionerror />
		</div>
	</s:if>


	<div class="center">

		<table border="1" width="100%">
			<thead>
				<tr>
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Quantity</th>
					<th>Category</th>
					<th colspan="2">Action</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator var="product" value="products">
					<tr>
						<td><s:property value="productId" /></td>
						<td><s:property value="productName" /></td>
						<td><s:property value="quantity" /></td>
						<td><s:property value="category" /></td>
						<td><a
							href="updateProduct?productId=<s:property value="productId" />">Update</a>
						</td>
						<td><a
							href="deleteProduct?productId=<s:property value="productId" />">Delete</a>
						</td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>

</body>
</html>