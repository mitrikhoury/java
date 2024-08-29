<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>${book.getTitle()}</title>
<style>
body {
	font-family: Arial, sans-serif;
}

h2 {
	color: #085394;
}

.form {
	margin: 10px;
	padding: 25px;
	border: 2px solid black;
	border-radius: 10px;
	width:150px;
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
	<h2>${book.getTitle()}by ${book.getAuthor()}</h2>
	<p>Posted by ${book.getUser().getUserName()}</p>
	<h3>Here are ${book.getUser().getUserName()}'s thoughts:</h3>
<p>Book User ID: ${book.getUser().getId()}</p>
	<c:if test="${user.getId() == book.getUser().getId()}">
		<form action="/books/${book.getId()}/edit" method="get" class="form">
			<input type="submit" value="Edit" class="BtnSend">
		</form>
		<form action="/books/${book.getId()}/delete" method="post" class="form">
			<input type="submit" value="Delete" class="BtnSend">
		</form>
	</c:if>
	<a href="/books">back to the shelves</a>
</body>
</html>