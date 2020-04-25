<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css"
        rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Orders</title>
</head>
<body>
	<h2>List of Orders</h2>
	<c:forEach items="${orders}" var="order">
		<h3>${order.oId}</h3>
		<table id="t01">
		
			<tr>			
				<th>Quantity</th>
				<th>Order Date</th>
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
	<hr>
	<a href="/index.html">Home</a>
	<hr>
	<a href="/addProduct.html">Add Product</a>
	<a href="/addOrder.html">Add Order</a>
	<a href="/addCustomer.html">Add Customer</a>
	<hr>
	<a href="/ListProducts.html">List Products</a>
	<a href="/ListOrders.html">List Orders</a>
	<a href="/ListCustomers.html">List Customers</a>
	
</body>
</html>