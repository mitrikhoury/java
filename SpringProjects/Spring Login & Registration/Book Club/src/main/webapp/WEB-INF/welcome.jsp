<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Login And Registration</title>
<style>
h1 {
	color: #AF37FF;
}
</style>
</head>
<body>

	<h1>
		Welcome,
		<c:out value="${user.userName}"></c:out>
		!
	</h1>
	<p>This is your dashboard. Nothing to see here yet.</p>
	<p>
		<a href="/logout">logout</a>
	</p>
</body>
</html>