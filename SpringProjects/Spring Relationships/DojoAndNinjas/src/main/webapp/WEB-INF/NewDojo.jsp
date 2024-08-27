<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>New Dojo</title>
    <style> 
    
.form {
	margin: 10px;
	padding: 25px;
	border: 2px solid black;
	border-radius: 10px;
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
<h1>New Dojo</h1>
<form:form action="/dojo/new" modelAttribute="dojo" method="post" class="form">
    <p>Name: <form:input path="name" /></p>
    <p><input type="submit" value="Create" class="BtnSend"/></p>
</form:form>
</body>
</html>