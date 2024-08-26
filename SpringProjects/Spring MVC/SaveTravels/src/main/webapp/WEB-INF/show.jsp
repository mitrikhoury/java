<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show page</title>
<style>
.first_box {
	display: flex;
	justify-content: space-between;
}

.first_box h1 {
	color: #085394;
	position: relative;
	right: 20px;
}

.first_box a {
	position: relative;
	left: 100px;
	top: 30px;
}

.con {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	align-content: center;
}
</style>
</head>
<body>
	<div class="con">

		<div class="first_box">
			<h1>Expense Details</h1>
			<a href="/expenses">Go back</a>
		</div>

		<div>
			<h3>
				Expense Name:
				<c:out value="${expense.getExpense_name()}"></c:out>
			</h3>
			<h3>
				Expense description :
				<c:out value="${expense.getDescription()}"></c:out>
				.
			</h3>
			<h3>
				Vendor :
				<c:out value="${expense.getVendor()}"></c:out>
				.
			</h3>
			<h3>
				Amount Spent : $
				<c:out value="${expense.getAmount()}"></c:out>
				.
			</h3>
		</div>
	</div>
</body>
</html>