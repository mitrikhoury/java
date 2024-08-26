<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

.delete_link {
	color: white;
	background-color: #E06666;
	border: 1px solid black;
}

.con {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	align-content: center;
}

.form {
	margin: 10px;
	padding: 25px;
	border: 2px solid black;
	border-radius: 10px;
}
.form-location{
display: flex;
justify-content: center;
padding: 10px;
margin: 5px;
}
space {
padding: 5px;
margin: 10px;
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

		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>Action</th>
				
				</tr>
			</thead>
			<tbody>
				<c:forEach var="languages" items="${languages}">
					<tr>
						<td><a href="/Languages/${languages.getId()}"> <c:out value="${languages.getName()}" /></a></td>
						<td><c:out value="${languages.getCreator()}" /></td>
						<td><c:out value="${languages.getVersion()}" /></td>
						<td>
						<div class="form-location">
						<div class="space">
						<form action="/Languages/edit/${languages.getId()}" method="Get"> 
						<input class="delete_link" type="submit" value="edit">
						</form>
						</div>
						<div class="space">
						<form action="/Languages/delete-item/${languages.getId()}" method="post">
						<input class="delete_link" type="submit" value="delete">
						</form>
						</div>	
						</div>
						</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		
   <div class="con">
		<h1>Add a Languages</h1>

		<form:form action="/add" method="post" modelAttribute="language" class="form">
			<p>
				<form:label path="name">Name</form:label>
				<form:errors path="name" />
				<form:input path="name" />
			</p>
			<p>
				<form:label path="Creator">Creator</form:label>
				<form:errors path="Creator" />
				<form:input path="Creator" />
			</p>
			<p>
				<form:label path="version">version</form:label>
				<form:errors path="version" />
				<form:input path="version" />
			</p>
			<input class="BtnSend" type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>