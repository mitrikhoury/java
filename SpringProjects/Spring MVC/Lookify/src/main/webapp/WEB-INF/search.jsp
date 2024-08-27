<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Search Results</title>
</head>
<body>
    <h1>Songs by artist: <c:out value="${artist}"></c:out></h1>
    <a href="/dashboard">Dashboard</a>
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
                <td><a href="/songs/${song.id}"> <c:out value="${song.title}"></c:out></a></td>
                <td> <c:out value="${song.rating}"></c:out></td>
                <td>
                    <a href=/songs/${song.id}/delete">delete</a>
                </td>
            </tr>
             </c:forEach>
        </tbody>
    </table>
</body>
</html>