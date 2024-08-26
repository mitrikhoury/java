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
	<div class="con">
		<h1>Save Travels</h1>

		<table>
			<thead>
				<tr>
					<th>Expense</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th>Action</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="expenses" items="${expenses}">
					<tr>
						<td><a href="/expenses/${expenses.getId()}"> <c:out
									value="${expenses.getExpense_name()}" /></a></td>
						<td><c:out value="${expenses.getVendor()}" /></td>
						<td><c:out value="${expenses.getAmount()}" /></td>
						<td><a href="/expenses/edit/${expenses.getId()}">Edit</a></td>
						<td><form action="/expensess/delete-item/${expenses.getId()}"
								method="post">
								<input class="delete_link" type="submit" value="delete">
							</form></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<div class="con">
		<h1>Add an expense</h1>

		<form:form action="/add" method="post" modelAttribute="expense"
			class="form">
			<p>
				<form:label path="expense_name">Expense Name</form:label>
				<form:errors path="expense_name" />
				<form:input path="expense_name" />
			</p>
			<p>
				<form:label path="vendor">Vendor</form:label>
				<form:errors path="vendor" />
				<form:input path="vendor" />
			</p>
			<p>
				<form:label path="amount">Amount</form:label>
				<form:errors path="amount" />
				<form:input path="amount" />
			</p>
			<p>
				<form:label path="description">Description</form:label>
				<form:errors path="description" />
				<form:textarea path="description" />
			</p>
			<input class="BtnSend" type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>