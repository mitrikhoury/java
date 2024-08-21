<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show</title>
<link rel="stylesheet" type="text/css" href="/css/showStyle.css">
</head>
<body>
<div class="cotainer">

<h1>Here's Your Omikuji!</h1>

<div class="messageBox">
  <p>In <span> <c:out value="${numberInput}"></c:out> </span> years, you will live in <span> <c:out value="${cityName}"></c:out> </span> with  <span> <c:out value="${personName}"></c:out> </span> as your roommate, <span> <c:out value="${hobby}"></c:out> </span> for a living. The next time you see a <span> <c:out value="${livingType}"></c:out> </span>, you will have good luck. Also, <span>  <c:out value="${niceNote}"></c:out></span></p>
</div>
  <a href="/omikuji">Go Back</a>
</div>
</body>
</html>