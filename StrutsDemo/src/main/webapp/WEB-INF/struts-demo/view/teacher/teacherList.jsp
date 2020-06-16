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
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 col-sm-12 col-lg-12 col-12 mt-3 mb-3">
				<s:if test="hasActionMessages()">
					<div class="alert alert-info">
						<s:actionmessage />
					</div>
				</s:if>
				<s:if test="hasActionErrors()">
					<div class="alert alert-error">
						<s:actionerror />
					</div>
				</s:if>
				<div class="card">
					<div class="card-header">
						<h4 class="card-title" style="display: inline-block;">Teacher
							List</h4>
						<a href="<s:url action="teacherForm.action" />"
							class="btn btn-primary"
							style="display: inline-block; float: right;">New Teacher</a>
					</div>
					<div class="card-body">

						<table id="table-1" class="table table-bordered table-responsive">
							<thead>
								<tr>
									<th>Id</th>
									<th>Name</th>
									<th>DOB</th>
									<th>Email Id</th>
									<th>Mobile Number</th>
									<th>Designation</th>
									<th>Department</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="teachers">
									<tr>
										<td><s:property value="teacherId" /></td>
										<td><s:property value="name" /></td>
										<td><s:property value="dob" /></td>
										<td><s:property value="emailId" /></td>
										<td><s:property value="mobileNumber" /></td>
										<td><s:property value="designation" /></td>
										<td><s:property value="department" /></td>
										<td></td>
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