<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css"
        rel="stylesheet">
</head>
<body>
<h2>Add new order</h2>
	<form:form modelAttribute="order">
		<table>

			<tr>
				<td>customer</td>
				<td><form:select path="cust" items="${customersList}" /></td>
			</tr>

			<tr>
				<td>product</td>
				<td><form:select path="prod" items="${productsList}" /></td>
			</tr>

			<tr>
				<td>Quantity:</td>
				<td><form:input path="qty" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form:form>
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