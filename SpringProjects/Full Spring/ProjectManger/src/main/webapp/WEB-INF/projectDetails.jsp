<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Project Details</title>
<style>
.details {
	display: flex;
	flex-direction: column;
	border: 1px solid #D0D0D0;
	align-content: center;
	align-items: center;
	padding: 2px;
	margin: 10px;
	width: 400px;
}

.cont {
    display :flex;
	align-items: center;
	align-content: center;
	flex-direction: column;
}
</style>
</head>
<body>
	<div class="cont">
		<div class="details">
			<h1>Project Details</h1>
			<h2>${project.title}</h2>
			<p>${project.description}</p>
			<p>Due Date: ${project.dueDate}</p>
			<a href="/dashboard">Back to Dashboard</a>

		</div>
	</div>

</body>
</html>