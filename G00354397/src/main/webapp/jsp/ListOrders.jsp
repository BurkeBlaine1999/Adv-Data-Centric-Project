<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
	text-align: center;
}

table#t01 {
	background-color: #e5e5ff;
}
</style>


<meta charset="ISO-8859-1">
<title>Orders</title>
</head>
<body>
	<h2>List of Orders</h2>
	<c:forEach items="${orders}" var="order">
		<h3>${order.oId}</h3>
		<table id="t01">
			<tr>
				<th>Order ID</th>
				<th>Order Quantity</th>
				<th>customer ID</th>
				<th>customer Name</th>
				<th>product ID</th>
				<th>Description</th>
			</tr>

			<tr>
				<td>${order.qty}</td>
				<td>${order.orderDate}</td>
				<td>${order.cust.cId}</td>
				<td>${order.cust.cName}</td>
				<td>${order.prod.pId}</td>
				<td>${order.prod.pDesc}</td>
			</tr>

		</table>
	</c:forEach>
	<a href="/index.html">Return home</a>
</body>
</html>