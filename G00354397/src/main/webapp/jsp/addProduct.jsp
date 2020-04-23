<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="product">
	  <table>
	    <tr>
	      <td>Name:</td>
	      <td><form:input path="pDesc"></form:input></td>
	      <td><form:input path="qtyInStock"></form:input></td>
	    </tr>
	    <tr>
	      <td colspan="2">
	        <input type="submit" value="Add"/>
	      </td>
	    </tr>
	  </table>
	</form:form>
	<a href="/index.html">Return home</a>
</body>
</html>