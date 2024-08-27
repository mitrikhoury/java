<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <h1>Lookify Dashboard</h1>
    <a href="/songs/new">Add New</a>
    <a href="/search/topTen">Top Songs</a>
    <form action="/search" method="GET">
        <input type="text" name="artist" placeholder="Search Artists" required>
        <button type="submit">Search</button>
    </form>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Rating</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="song" items="${songs}">
            <tr>
                <td><a href="/songs/${song.id}"> <c:out value="${song.title}"></c:out> </a></td>
                <td><c:out value="${song.rating}"></c:out></td>
                <td>
                    <a href="/songs/{id}(id=${song.id}">delete</a>
                </td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>