<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Orders</title>
<link href="css/style.css"
        rel="stylesheet">
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