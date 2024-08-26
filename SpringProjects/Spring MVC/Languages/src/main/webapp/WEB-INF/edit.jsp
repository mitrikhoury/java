<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.form {
	margin: 10px;
	padding: 25px;
	border: 2px solid black;
	border-radius: 10px;
	width: 300px;
}

.BtnSend {
	color: white;
	background-color: rgb(43, 120, 228);
	margin-top: 10px;
	box-shadow: 3px 1px 1px black;
	width: 150px;
	height: 25px;
}

.con {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	align-content: center;
}

h1 {
	color: #80A76F;
}

.first_box {
	display: flex;
	justify-content: space-between;
}

.first_box a {
	position: relative;
	left: 60px;
	top: 30px;
}
</style>
</head>
<body>
	<div class="con">
		<div class="first_box">
			<h1>Edit language</h1>
			<a href="/Languages">Go back</a>
		</div>
		<form:form action="/Languages/${languageEdit.getId()}" method="post"
			modelAttribute="languageEdit" class="form">
			<p>
				<form:label path="name">Name</form:label>
				<form:errors path="name" />
				<form:input path="name" />
			</p>
			<p>
				<form:label path="Creator">Creator</form:label>
				<form:errors path="Creator" />
				<form:input path="Creator" />
			</p>
			<p>
				<form:label path="version">version</form:label>
				<form:errors path="version" />
				<form:input path="version" />
			</p>
			<input class="BtnSend" type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>