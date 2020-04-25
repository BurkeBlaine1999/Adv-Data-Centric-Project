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
<h2>List of Products</h2>
	<table id="t01">
	<tr>
		<th>Product ID</th>
		<th>Product description</th>
		<th>Product quantity</th>
	</tr>
		<c:forEach items="${products}" var="product">
						<tr>
							<td>${product.pId}</td>
							<td>${product.pDesc}</td>
							<td>${product.qtyInStock}</td>
						</tr>
		</c:forEach>
	</table>
	<hr>
	<h4>Shortcuts</h4>
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