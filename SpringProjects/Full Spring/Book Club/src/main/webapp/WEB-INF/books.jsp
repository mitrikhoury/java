<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Book List</title>
<style>
body {
	font-family: Arial, sans-serif;
}

table {
	width: 50%;
	margin: 0 auto;
	border-collapse: collapse;
	border: 1px solid black;
}

th, td {
	padding: 10px;
	text-align: left;
	border-bottom: 1px solid black;
}

th {
	background-color: #f2f2f2;
}

h2 {
	color: #085394;
}
</style>
</head>
<body>
	<h2>Welcome, ${user.getUserName()}</h2>
	<a href="/books/new">+ Add a book to my shelf!</a>
	<a href="/logout">Logout</a>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author Name</th>
				<th>Posted By</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${books}">
				<tr>
					<td>${book.getId()}</td>
					<td><a href="/books/${book.getId()}">${book.getTitle()}</a></td>
					<td>${book.getAuthor()}</td>
					<td>${book.getOwner().getUserName()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>