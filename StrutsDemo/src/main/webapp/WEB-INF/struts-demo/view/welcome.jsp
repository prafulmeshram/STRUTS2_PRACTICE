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
						<h5 class="card-title" style="display: inline-block;">Employee
							List</h5>
						<a class="btn btn-primary" href="<s:url action='newEmployee' />"
							style="float: right;">New Employee</a>
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


						<table id="table-1" class="table table-bordered table-responsive">
							<thead>
								<tr>
									<th>Id</th>
									<th>Name</th>
									<th>Address</th>
									<th>Mobile Number</th>
									<th>Email</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="employees">
									<tr>
										<td><s:property value="empId" /></td>
										<td><s:property value="firstName" />&nbsp;<s:property
												value="middleName" />&nbsp;<s:property value="lastName" /></td>
										<td><s:property value="address" />,<s:property
												value="city" />, <s:property value="state" />- <s:property
												value="zipcode" /></td>
										<td><s:property value="mobileNumber" /></td>
										<td><s:property value="emailId" /></td>
										<td><a
											href="viewEmployee.action?empId=<s:property value="empId" />"
											class="btn btn-primary btn-sm"><i class="fa fa-eye"></i></a>
											<a
											href="updateEmployee.action?empId=<s:property value="empId"/>"
											class="btn btn-warning  btn-sm"><i class="fa fa-edit"></i></a>
											<a
											href="deleteEmployee.action?empId=<s:property value="empId"/>"
											class="btn btn-danger  btn-sm"><i class="fa fa-trash"></i></a></td>

										<%-- 
											<s:url id="updateURL" action="updateEmployee">
												<s:param name="empId" value="%{empId}"></s:param>
											</s:url> <s:a href="%{updateURL}">Edit</s:a> --%>
									</tr>
								</s:iterator>
							</tbody>

						</table>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>