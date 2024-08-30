<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Book Market</title>

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

h1 {
	color: #085394;
}
.BtnSend {
	color: white;
	background-color: rgb(43, 120, 228);
	margin-top: 10px;
	box-shadow: 3px 1px 1px black;
	width: 150px;
	height: 25px;
}
</style>
</head>
<body>
	<h1>Welcome to the Book Market, ${user.userName}</h1>
	<a href="/logout">Logout</a>

	<h2>Available Books to Borrow</h2>
	<table>
		<thead>
			<tr>
				<th>Title</th>
				<th>Author</th>
				<th>Owner</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${books}">
				<tr>
					<td>${book.title}</td>
					<td>${book.author}</td>
					<td>${book.owner.userName}</td>
					<td><c:if test="${user.getId() == book.getOwner().getId()}">
							<form action="/books/edit/${book.getId()}" method="Get"
								class="form">
								<input type="submit" value="Edit" class="BtnSend">
							</form>
							<form action="/books/delete/${book.getId()}" method="post"
								class="form">
								<input type="submit" value="Delete" class="BtnSend">
							</form>
						</c:if> <c:if test="${user.getId() != book.getOwner().getId()}">
							<a href="/bookmarket/${book.id}">Borrow</a>
						</c:if></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<h2>Books I'm Borrowing</h2>
	<table>
		<thead>
			<tr>
				<th>Title</th>
				<th>Author</th>
				<th>Owner</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="myBook" items="${myBooks}">
				<tr>
					<td>${myBook.title}</td>
					<td>${myBook.author}</td>
					<td>${myBook.owner.userName}</td>
					<td><a href="/bookmarket/return/${myBook.id}">Return</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>