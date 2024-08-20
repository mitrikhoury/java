<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>date page</title>
<link rel="stylesheet" type="text/css" href="/css/date.css">
<script src="/js/date.js"></script>
</head>
<body>
 <h1 class="date"><c:out value="${currentDate}"></c:out></h1>
</body>
</html>