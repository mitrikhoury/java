<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Dojo Page</title>
    <style>
    table {
	width: 50%;
	margin: 0 auto;
	border-collapse: collapse;
	border: 1px solid black;
}

th, td {
	padding: 10px;
	text-align: left;
	border-bottom: 1px solid black;
}

th {
	background-color: #f2f2f2;
}
h1 {
	color: #085394;
	position: relative;
	left :730px;
}

    
    </style>
</head>

<body>
<h1> <c:out value="${dojo.name} "></c:out> Location Ninjas</h1>
<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
    </tr>
    <c:forEach var="ninja" items="${dojo.ninjas}">
     <tr>
        <td> <c:out value="${ninja.firstName}"></c:out> </td>
        <td><c:out value="${ninja.lastName}"></c:out></td>
        <td><c:out value="${ninja.age}"></c:out></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>