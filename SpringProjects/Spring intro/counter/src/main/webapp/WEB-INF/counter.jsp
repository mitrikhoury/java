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
<h3>You have visited http://your_server <c:out value="${number}"></c:out> times  </h3>
<h3> <a href="/your_server">Test another visit?</a> </h3>
</body>
</html>