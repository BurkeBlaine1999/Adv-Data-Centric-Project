<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<th>Order Date</th>
		</tr>
			<c:forEach items="${orders}" var="order">
							<tr>
								<td>${order.qty}</td>
								<td>${order.orderDate}</td>
								<td>${order.cust}</td>
								<td>${order.prod}</td>
							</tr>
			</c:forEach>
		</table>
	</c:forEach>
</body>
</html>