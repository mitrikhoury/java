<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>New Ninja</title>
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
<h1>New Ninja</h1>
<form:form action="/ninjas/new" modelAttribute="ninja" method="post" class="form">
    <p>Dojo:
       <form:select path="dojo.id">
            <c:forEach var="dojo" items="${dojos}">
                <form:option value="${dojo.id}">${dojo.name}</form:option>
            </c:forEach>
        </form:select>
    </p>
    <p>First Name: <form:input path="firstName" /></p>
    <p>Last Name: <form:input path="lastName" /></p>
    <p>Age: <form:input path="age"/></p>
    <p><input type="submit" value="Create" class="BtnSend" /></p>
</form:form>
</body>
</html>