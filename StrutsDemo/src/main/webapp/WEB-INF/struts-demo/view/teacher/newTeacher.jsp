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
	<div class="container">

		<s:form action="saveTeacher" name="teacherForm" method="post"
			enctype="multipart/form-data">

			<s:hidden name="teacherId" />

			<div class="row">
				<div class="col-md-12 col-sm-12 col-lg-12 col-12 mb-3 mt-3">
					<div class="card">
						<div class="card-header">
							<s:if test="teacherId == null">
								<h4 class="card-title">New Teacher</h4>
							</s:if>
							<s:else>
								<h4 class="card-title">Update Teacher</h4>
							</s:else>
						</div>
						<div class="card-body">
							<div class="row form-group">
								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<s:label for="name">Full Name</s:label>
									<s:textfield name="name" id="name" cssClass="form-control"
										placeholder="Enter Full Name" />
								</div>
								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<s:label for="dob">Date Of Birth</s:label>
									<s:textfield name="dob" id="dob" cssClass="form-control"
										type="date" />
								</div>
								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<s:label for="emailId">Email Id</s:label>
									<s:textfield name="emailId" id="emailId" type="email"
										cssClass="form-control" placeholder="Enter Email Id" />
								</div>
							</div>


							<div class="row form-group">
								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<s:label for="mobileNumber">Mobile Number</s:label>
									<s:textfield name="mobileNumber" id="mobileNumber"
										cssClass="form-control" placeholder="Enter Mobile Number" />
								</div>
								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<s:label for="designation">Designation</s:label>
									<s:textfield name="designation" id="designation"
										cssClass="form-control" placeholder="Enter Designation" />
								</div>
								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<s:label for="department">Department</s:label>
									<s:textfield name="department" id="department" type="text"
										cssClass="form-control" placeholder="Enter Department Name" />
								</div>
							</div>

							<div class="row form-group">
								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<s:label for="image">Image</s:label>
									<s:file name="image" id="image" cssClass="form-control" />
								</div>
							</div>
						</div>


						<div class="card-header">
							<h4 class="card-title">Address Details</h4>
						</div>
						<div class="card-body">
							<div class="row form-group">
								<div class="col-md-2 col-sm-2 col-lg-2 col-12">
									<s:label for="addType">Address Type</s:label>
									<s:select headerKey="-1" headerValue="Select Address Type"
										list="addTypeList" name="addType" class="form-control" />
								</div>
								<div class="col-md-2 col-sm-2 col-lg-2 col-12">
									<s:label for="address">Address</s:label>
									<s:textfield name="address" id="address"
										cssClass="form-control" placeholder="Enter Address" />
								</div>
								<div class="col-md-2 col-sm-2 col-lg-2 col-12">
									<s:label for="city">City</s:label>
									<s:textfield name="city" id="city" type="text"
										cssClass="form-control" placeholder="Enter City" />
								</div>
								<div class="col-md-2 col-sm-2 col-lg-2 col-12">
									<s:label for="state">State</s:label>
									<s:textfield name="state" id="state" type="text"
										cssClass="form-control" placeholder="Enter State" />
								</div>

								<div class="col-md-2 col-sm-2 col-lg-2 col-12">
									<s:label for="zipcode">Zipcode</s:label>
									<s:textfield name="city" id="city" type="text"
										cssClass="form-control" placeholder="Enter City" />
								</div>
								<div class="col-md-2 col-sm-2 col-lg-2 col-12">
									<a class="btn btn-primary btn btn-block mt-4" id="addAddress">ADD</a>
								</div>
							</div>
							<div class="row form-group">
								<div
									class="col-md-12 col-sm-12 col-lg-12 col-12  table-responsive">
									<table id="addressTable" class="table table-bordered">
										<thead>
											<tr>
												<th>Action</th>
												<th>Address Type</th>
												<th>Address</th>
												<th>City</th>
												<th>State</th>
												<th>Zipcode</th>
											</tr>
										</thead>
										<tbody id="addressTableBody">
										</tbody>
									</table>
								</div>
							</div>
						</div>



						<div class="card-header">
							<h4 class="card-title">Educational Qualification</h4>
						</div>
						<div class="card-body">
							<div class="row form-group">
								<div class="col-md-3 col-sm-3 col-lg-3 col-12">
									<s:label for="exam">Exam Name</s:label>
									<s:textfield name="exam" id="exam" cssClass="form-control"
										placeholder="Enter Exam Name" />
								</div>
								<div class="col-md-3 col-sm-3 col-lg-3 col-12">
									<s:label for="board">Board / University</s:label>
									<s:textfield name="board" id="board" type="text"
										cssClass="form-control" placeholder="Enter Board" />
								</div>
								<div class="col-md-2 col-sm-2 col-lg-2 col-12">
									<s:label for="year">Year</s:label>
									<s:textfield name="year" id="year" type="text"
										cssClass="form-control" placeholder="Enter Year" />
								</div>

								<div class="col-md-2 col-sm-2 col-lg-2 col-12">
									<s:label for="subject">Subject</s:label>
									<s:textfield name="subject" id="subject" type="text"
										cssClass="form-control" placeholder="Enter Subject" />
								</div>
								<div class="col-md-2 col-sm-2 col-lg-2 col-12">
									<a class="btn btn-primary btn btn-block mt-4">ADD</a>
								</div>
							</div>
							<div class="row form-group">
								<div
									class="col-md-12 col-sm-12 col-lg-12 col-12  table-responsive">
									<table id="qualTable" class="table table-bordered">
										<thead>
											<tr>
												<th>Action</th>
												<th>Exam</th>
												<th>Board / University</th>
												<th>Year</th>
												<th>Subject</th>
											</tr>
										</thead>
										<tbody id="qualTableBody">
										</tbody>
									</table>
								</div>
							</div>
						</div>
						<div class="card-header">
							<h4 class="card-title">Work Experience</h4>
						</div>
						<div class="card-body">
							<div class="row form-group">

								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<s:label for="instName">Institute Name</s:label>
									<s:textfield name="instName" id="instName"
										cssClass="form-control" placeholder="Enter Institute Name" />
								</div>
								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<s:label for="post">Post</s:label>
									<s:textfield name="post" id="post" type="text"
										cssClass="form-control" placeholder="Enter Post" />
								</div>
								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<s:label for="dept">Department</s:label>
									<s:textfield name="dept" id="dept" type="text"
										cssClass="form-control" placeholder="Enter Department" />
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<s:label for="fromDate">From</s:label>
									<s:textfield name="fromDate" id="fromDate" type="date"
										cssClass="form-control" />
								</div>
								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<s:label for="toDate">To</s:label>
									<s:textfield name="toDate" id="toDate" type="date"
										cssClass="form-control" />
								</div>

								<div class="col-md-4 col-sm-4 col-lg-4 col-12">
									<a class="btn btn-primary btn btn-block mt-4">ADD</a>
								</div>
							</div>
							<div class="row form-group">
								<div
									class="col-md-12 col-sm-12 col-lg-12 col-12  table-responsive">
									<table id="expTable" class="table table-bordered">
										<thead>
											<tr>
												<th>Action</th>
												<th>Institute Name</th>
												<th>Post</th>
												<th>Department</th>
												<th>From</th>
												<th>To</th>
										<tbody id="expTableBody">
										</tbody>
									</table>
								</div>
							</div>


							<div class="row form-group">
								<s:submit name="submit" value="SUBMIT" class="btn btn-primary"></s:submit>
							</div>
						</div>

					</div>
				</div>
			</div>
		</s:form>
	</div>



	<script type="text/javascript" src="assets/js/jquery-3.4.1.min.js"></script>

	<script type="text/javascript">
		$(document).ready(function() {
			$('#addAddress').click(function() {
				alert("Clicked");

			})
		});
	</script>

</body>
</html>