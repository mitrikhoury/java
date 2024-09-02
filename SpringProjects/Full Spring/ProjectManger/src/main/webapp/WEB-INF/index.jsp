<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Project Manager</title>
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
	flex-direction: column;
	padding: 10px;
	margin: 10px;
	padding: 10px;
	margin: 10px;
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
    <h1>Project Manager</h1>
    
    <div class="forms-box">
    
    <div class="form">
       <h2>Register</h2>
    <form:form method="POST" modelAttribute="newUser" class="form" action="/register">
        <form:errors path="*" cssClass="error" />
        First Name: <form:input path="firstName" /><br />
        Last Name: <form:input path="lastName" /><br />
        Email: <form:input path="email" /><br />
        Password: <form:password path="password" /><br />
        Confirm PW: <form:password path="confirm" /><br />
        <input type="submit" value="Register" class="BtnSend" />
    </form:form>
    
    </div>
     
     <div class="form">
      <h2>Log in</h2>
    <form:form method="POST" modelAttribute="newLogin" action="/login">
        <form:errors path="*" cssClass="error" />
        Email: <form:input path="email" /><br />
        Password: <form:password path="password" /><br />
        <input type="submit" value="Log in" class="BtnSend" />
    </form:form>

     </div>
    </div>
   
</body>
</html>