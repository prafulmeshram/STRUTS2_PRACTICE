<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Upload User Image</title>
</head>

<body>
	<h2>Struts2 File Upload & Save Example</h2>
	<s:actionerror />
	<s:form action="upload" method="post" enctype="multipart/form-data">
		<s:file name="upload" label="File" />
		<s:submit value="Upload" align="center" />
	</s:form>


	<h2>Multiple Uploads</h2>
	<s:form action="multyUpload" method="post"
		enctype="multipart/form-data">
		<s:file name="upload" label="File" />
		<s:file name="upload" label="File" />
		<s:file name="upload" label="File" />
		<s:file name="upload" label="File" />
		<s:file name="upload" label="File" />
		<s:file name="upload" label="File" />
		<s:submit value="Upload" align="center" />
	</s:form>


	<a href="download?fileName=nandlogo.jpg">Download</a>


</body>
</html>