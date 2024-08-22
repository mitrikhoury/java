<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> <c:out value="${book.getTitle()}"></c:out></h1>
<h3> Book description :  <c:out value="${book.getDescription()}"></c:out> .</h3>
<h3> Book Language :  <c:out value="${book.getLanguage()}"></c:out> .</h3>
<h3> Number of Pages :  <c:out value="${book.getNumberOfPages()}"></c:out> .</h3>
<c:out value="${books}"></c:out>
</body>
</html>