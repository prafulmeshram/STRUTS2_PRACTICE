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
	<div class="container-fluid mt-3 mb-3">
		<div class="row">
			<div class="col-md-12 col-sm-12 col-lg-12 col-12">
				<div class="card">
					<div class="card-header">
						<h4 class="card-title">View Employee</h4>
					</div>
					<div class="card-body">
						<s:if test="hasActionMessages()">
							<div class="alert alert-info">
								<s:actionmessage />
							</div>
						</s:if>
						<s:if test="hasActionErrors()">
							<div class="alert alert-danger">
								<s:actionerror />
							</div>
						</s:if>


						<table id="table-1" class="table table-striped">
							<tr>
								<th>Employee Id</th>
								<td><s:property value="empId" /></td>
							</tr>
							<tr>
								<th>Full Name</th>
								<td><s:property value="%{employee.firstName}" />&nbsp;<s:property
										value="%{employee.middleName}" />&nbsp;<s:property
										value="%{employee.lastName}" /></td>
							</tr>
							<tr>
								<th>Mobile Number</th>
								<td><s:property value="%{employee.mobileNumber}" /></td>
							</tr>
							<tr>
								<th>Email Id</th>
								<td><s:property value="%{employee.emailId}" /></td>
							</tr>

							<tr>
								<th>Address</th>
								<td><s:property value="%{employee.address}" />, <s:property
										value="%{employee.city}" />, <s:property
										value="%{employee.state}" />-<s:property
										value="%{employee.zipcode}" /></td>
							</tr>


						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>