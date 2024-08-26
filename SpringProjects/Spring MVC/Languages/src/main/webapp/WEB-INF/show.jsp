<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit page</title>
</head>
<body>
<h3><c:out value="${language.getName()}"></c:out></h3>
<h3><c:out value="${language.getCreator()}"></c:out></h3>
<h3><c:out value="${language.getVersion()}"></c:out></h3>
<a href="/Languages/edit/${language.getId()}">Edit</a><br>
<a href="/Languages">dashboard</a>
</body>
</html>