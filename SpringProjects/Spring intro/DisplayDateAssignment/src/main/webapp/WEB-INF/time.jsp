<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>time page</title>
<link rel="stylesheet" type="text/css" href="/css/time.css">
<script src="/js/time.js"></script>
</head>
<body>
  <h1 class="time"><c:out value="${currentTime}"></c:out></h1>
</body>
</html>