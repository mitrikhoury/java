<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Details</title>
</head>
<body>
    <h1>Song Details</h1>
    <p>Title: <c:out value="${song.title}"></c:out></p>
    <p>Artist:<c:out value="${song.artist}"></c:out> </p>
    <p>Rating: <c:out value="${song.rating}"></c:out></p>
    <a href="/songs/{id}/delete(id=${song.id})">Delete</a>
    <a href="/dashboard">Back to Dashboard</a>
</body>
</html>