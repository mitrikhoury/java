<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>

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
.newProject{
position: relative;
left : 1240px;
padding: 10px;
margin: 10px;

}
.BtnSend {
	color: white;
	background-color: rgb(43, 120, 228);
	margin-top: 10px;
	box-shadow: 3px 1px 1px black;
	width: 50px;
	height: 20px;
	text-decoration :none;
	border: 1px solid black;'
}
.BtnSend h:hover {
	cursor: progress;
}
</style>
</head>
<body>
	<h1>Welcome, ${user.firstName}</h1>
	<a href="/logout">Logout</a>
	<h2>All Projects</h2>
	<a href="/projects/new" class="newProject">+ new project</a>
	<table>
		<tr>
			<th>Project</th>
			<th>Team Lead</th>
			<th>Due Date</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="project" items="${unassignedProjects}">
			<tr>
				<td><a href="/projects/${project.id}">${project.title}</a></td>
				<td>${project.lead.firstName}${project.lead.lastName}</td>
				<td>${project.dueDate}</td>
				<td><a href="/projects/${project.id}/join">Join team</a></td>
			</tr>
		</c:forEach>
	</table>

	<h2>Your Projects</h2>
	<table>
		<tr>
			<th>Project</th>
			<th>Team Lead</th>
			<th>Due Date</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="project" items="${assignedProjects}">
			<tr>
				<td><a href="/projects/${project.id}">${project.title}</a></td>
				<td>${project.lead.firstName}${project.lead.lastName}</td>
				<td>${project.dueDate}</td>
				<td><c:if test="${project.lead.id == user.id}">
						<a href="/projects/edit/${project.id}" Class="BtnSend">Edit</a>
						<form action="/projects/delete/${project.id}" method="POST"
							style="display: inline">
							<input type="hidden" name="_method" value="DELETE" /> <input
								type="submit" Class="BtnSend" value="Delete" />
						</form>
					</c:if> <a href="/projects/${project.id}/leave"  Class="BtnSend">Leave team</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>