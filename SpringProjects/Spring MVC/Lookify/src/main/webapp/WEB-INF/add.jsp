<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Song</title>
</head>
<body>
    <h1>Add New Song</h1>
    <form action="/songs" method="POST">
        <label>Title:</label>
        <input type="text" name="title">
        <br>
        <label>Artist:</label>
        <input type="text" name="artist" >
        <br>
        <label>Rating (1-10):</label>
        <input type="number" name="rating" min="1" max="10" >
        <br>
        <button type="submit">Add Song</button>
    </form>
    <a href="/dashboard">Back to Dashboard</a>
</body>
</html>