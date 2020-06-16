<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row form-group">
			<div class="col-12 co-md-12 col-sm-12 col-lg-12">
				<div class="card mt-3 mb-3">
					<div class="card-header">
						<h4 class="card-title">
							<s:if test="empId==null">New Employee</s:if>
							<s:else>Update Employee</s:else>
						</h4>
					</div>
					<div class="card-body">


						<s:if test="hasActionErrors()">
							<div class="alert alert-danger" role="alert">
								<s:actionerror />
							</div>
						</s:if>
						<s:elseif test="hasActionMessages()">
							<div class="alert alert-success" role="alert">
								<s:actionmessage />
							</div>
						</s:elseif>

						<s:form action="saveEmployee" name="employeeForm" method="post"
							enctype="multipart/form-data">
							<s:hidden name="empId" />


							<div class="row form-group">
								<div class="col-md-3 col-sm-3 col-lg-3 col-12">
									<s:label for="firstName">First Name</s:label>
								</div>
								<div class="col-md-9 col-sm-9 col-lg-9 col-12">
									<s:textfield name="firstName" id="firstName"
										value="%{employee.firstName}" placeholder="Enter First Name"
										class="form-control"></s:textfield>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-3 col-sm-3 col-lg-3 col-12">
									<s:label for="middleName">Middle Name</s:label>
								</div>
								<div class="col-md-9 col-sm-9 col-lg-9 col-12">
									<s:textfield name="middleName" id="middleName"
										value="%{employee.middleName}" placeholder="Enter Middle Name"
										class="form-control"></s:textfield>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-3 col-sm-3 col-lg-3 col-12">
									<s:label for="lastName">Last Name</s:label>
								</div>
								<div class="col-md-9 col-sm-9 col-lg-9 col-12">
									<s:textfield name="lastName" id="lastName"
										value="%{employee.lastName}" placeholder="Enter Last Name"
										class="form-control"></s:textfield>
								</div>
							</div>

							<div class="row form-group">
								<div class="col-md-3 col-sm-3 col-lg-3 col-12">
									<s:label for="mobileNumber">Mobile Number</s:label>
								</div>
								<div class="col-md-9 col-sm-9 col-lg-9 col-12">
									<s:textfield name="mobileNumber" id="mobileNumber"
										value="%{employee.mobileNumber}"
										placeholder="Enter Mobile Number" class="form-control"></s:textfield>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-3 col-sm-3 col-lg-3 col-12">
									<s:label for="emailId">Email Id</s:label>
								</div>
								<div class="col-md-9 col-sm-9 col-lg-9 col-12">
									<s:textfield name="emailId" id="emailId"
										value="%{employee.emailId}" placeholder="Enter Email Id"
										type="email" class="form-control"></s:textfield>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-3 col-sm-3 col-lg-3 col-12">
									<s:label for="address">Address</s:label>
								</div>
								<div class="col-md-9 col-sm-9 col-lg-9 col-12">
									<s:textarea name="address" id="address"
										value="%{employee.address}" placeholder="Enter Address"
										class="form-control" />
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-3 col-sm-3 col-lg-3 col-12">
									<s:label for="city">City</s:label>
								</div>
								<div class="col-md-9 col-sm-9 col-lg-9 col-12">
									<s:textfield name="city" id="City" placeholder="Enter City"
										value="%{employee.city}" class="form-control"></s:textfield>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-3 col-sm-3 col-lg-3 col-12">
									<s:label for="state">State</s:label>
								</div>
								<div class="col-md-9 col-sm-9 col-lg-9 col-12">
									<s:textfield name="state" id="state" value="%{employee.state}"
										placeholder="Enter State" class="form-control"></s:textfield>
								</div>
							</div>

							<div class="row form-group">
								<div class="col-md-3 col-sm-3 col-lg-3 col-12">
									<s:label for="zipcode">Zipcode</s:label>
								</div>
								<div class="col-md-9 col-sm-9 col-lg-9 col-12">
									<s:textfield name="zipcode" id="zipcode"
										value="%{employee.zipcode}" placeholder="Enter Zipcode"
										class="form-control"></s:textfield>
								</div>
							</div>


							<div class="row form-group">
								<div class="col-md-6 col-sm-6 col-lg-6 col-12">


									<s:if test="empId==null">
										<s:submit name="submit" value="SAVE"
											class="btn btn-primary btn-block"></s:submit>
									</s:if>
									<s:else>
										<s:submit name="submit" value="UPDATE"
											class="btn btn-primary btn-block"></s:submit>
									</s:else>


								</div>
								<div class="col-md-6 col-sm-6 col-lg-6 col-12">
									<s:reset name="reset" value="RESET"
										class="btn btn-danger btn-block"></s:reset>
								</div>
							</div>

						</s:form>
					</div>




				</div>
			</div>
		</div>
	</div>
</body>
</html>