<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
	<a href="/index.html">Return home</a>
</body>
</html>