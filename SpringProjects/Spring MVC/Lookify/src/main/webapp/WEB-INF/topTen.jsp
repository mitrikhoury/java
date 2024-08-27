<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Top Ten Songs</title>
</head>
<body>
    <h1>Top Ten Songs</h1>
    <a href="/dashboard">Dashboard</a>
    <table>
        <thead>
            <tr>
                <th>Rating</th>
                <th>Name</th>
                <th>Artist</th>
            </tr>
        </thead>
        <tbody>
         <c:forEach var="song" items="${songs}">
            <tr>
                <td> <c:out value="${song.rating}"></c:out></td>
                <td><a href ="/songs/${song.id}"><c:out value="${song.title}"></c:out> </a></td>
                <td><c:out value="${song.artist}"></c:out></td>
            </tr>
             </c:forEach>
        </tbody>
    </table>
</body>
</html>