<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Edit Book</title>
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
	<h2>Edit Your Book</h2>
	<form action="/books/edit/${book.getId()}" method="post" class="form">
		<label for="title">Title:</label> <input type="text" id="title"
			name="title" value="${book.getTitle()}" required><br> <label
			for="author">Author:</label> <input type="text" id="author"
			name="author" value="${book.getAuthor()}" required><br>
		<label for="thoughts">My thoughts:</label>
		<textarea id="thoughts" name="thoughts" required>${book.getThoughts()}</textarea>
		<br> <input type="submit" value="Submit" class="BtnSend">
	</form>
	<a href="/books">back to the shelves</a>
</body>
</html>