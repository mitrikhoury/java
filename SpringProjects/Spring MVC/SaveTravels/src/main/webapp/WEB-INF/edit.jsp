<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.form {
	margin: 10px;
	padding: 25px;
	border: 2px solid black;
	border-radius: 10px;
	width: 300px;
}

.BtnSend {
	color: white;
	background-color: rgb(43, 120, 228);
	margin-top: 10px;
	box-shadow: 3px 1px 1px black;
	width: 150px;
	height: 25px;
}

.con {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	align-content: center;
}

h1 {
	color: #80A76F;
}

.first_box {
	display: flex;
	justify-content: space-between;
}

.first_box a {
	position: relative;
	left: 60px;
	top: 30px;
}
</style>
</head>
<body>
	<div class="con">
		<div class="first_box">
			<h1>Edit Expense</h1>
			<a href="/expenses">Go back</a>
		</div>
		<form:form action="/expensess/${ExpenseEdit.getId()}" method="post"
			modelAttribute="ExpenseEdit" class="form">
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