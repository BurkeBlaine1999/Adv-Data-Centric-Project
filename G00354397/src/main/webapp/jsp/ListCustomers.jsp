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
	<table id="t01">
	<tr>
		<th>Customer ID</th>
		<th>Customer Name</th>
	</tr>
		<c:forEach items="${customers}" var="customer">
						<tr>
							<td>${customer.cId}</td>
							<td>${customer.cName}</td>
						</tr>
		</c:forEach>
	</table>
	
	<a href="/addOrder.html">Add Orders</a>
</body>
</html>