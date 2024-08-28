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
h1 {
	color: #AF37FF;
}

.forms-box {
	display: flex;
	padding: 10px;
	margin: 10px;
	justify-content: center;
	align-content: center;
	align-items: center;
}

.nav {
	display: flex;
	flex-direction: column; padding : 10px;
	margin: 10px;
	padding: 10px; margin : 10px;
	align-items: center;
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
	<div class="nav">
		<h1>Welcome !</h1>
		<h3>Join our growing community</h3>
	</div>

	<div class="forms-box">

		<div class="form">
			<h2>Register</h2>
			<form:form action="/register" method="post" modelAttribute="newUser"
				class="form">
				<p>
					<form:label path="userName">User Name :</form:label>
					<form:errors path="userName" />
					<form:input path="userName" />
				</p>
				<p>
					<form:label path="email">Email :</form:label>
					<form:errors path="email" />
					<form:input path="email" />
				</p>
				<p>
					<form:label path="password">Password :</form:label>
					<form:errors path="password" />
					<form:input path="password" type="password"/>
				</p>
				<p>
					<form:label path="confirm">Confirm PW :</form:label>
					<form:errors path="confirm" />
					<form:input path="confirm" type="password" />
				</p>
				<input class="BtnSend" type="submit" value="Submit" />
			</form:form>

		</div>

		<div class="form">
			<h2>Log in</h2>
			<form:form action="/login" method="post" modelAttribute="newLogin"
				class="form">
				<p>
					<form:label path="email">Email :</form:label>
					<form:errors path="email" />
					<form:input path="email" />
				</p>
				<p>
					<form:label path="password">Password :</form:label>
					<form:errors path="password" />
					<form:input path="password" type="password"/>
				</p>
				<input class="BtnSend" type="submit" value="Submit" />
			</form:form>


		</div>

	</div>
</body>
</html>