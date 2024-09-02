<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Project</title>
<style>

   h1 {
	color: #AF37FF;
}


.form {
	padding: 25px;
	margin: 2px;
	border: 1px solid #EFEFEF;
}

.BtnSend {
	color: white;
	background-color: rgb(43, 120, 228);
	margin-top: 10px;
	box-shadow: 3px 1px 1px black;
	width: 150px;
	height: 25px;
}

</style>
</head>
<body>
 <h1>Edit Project</h1>
  <form:form method="POST" modelAttribute="project" class="form" action="/projects/edit/${project.getId()}">
        <form:errors path="*" cssClass="error" />
        Title: <form:input  type="text"  path="title"/><br />
        Description: <form:textarea path="description" /><br />
        Due Date: <form:input path="dueDate" type="date" /><br />
        <input type="submit" class="BtnSend" value="Submit" />
    </form:form>
    <a href="/dashboard">Cancel</a>
</body>
</html>