<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Customer</title>
<link href="css/style.css"
        rel="stylesheet">
</head>
<body>
<h2>Add New Customer</h2>
	<form:form modelAttribute="customer">
	  <table>
	    <tr>
	      <td>Customer Name:</td>
	      <td><form:input path="cName"></form:input></td>
	    </tr>
	    <tr>
	      <td colspan="2">
	        <input type="submit" value="Add"/>
	      </td>
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