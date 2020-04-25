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
<h2>List of Customers</h2>


<c:forEach items="${customers}" var="customer">
<h3>${customer.cName}</h3>
	<table id="t01">
	<tr>
		<th>Order ID</th>
		<th>Order Quantity</th>
		<th>Order Date</th>
		<th>Description</th>
	</tr>
		<c:forEach items="${customer.orders}" var="order">
						<tr>
							<td>${order.oId}</td>
							<td>${order.qty}</td>
							<td>${order.orderDate}</td>
							<td>${order.prod.pDesc}</td>
						</tr>
		</c:forEach>
	</table>
</c:forEach>


	<a href="/index.html">Return</a>
</body>
</html>