<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Searched Mobile is: <br>
<table>
	<tr>
	<th>Mobile ID</th>
		<th>Mobile Name</th>
		<th>Mobile Price</th>
		<th>Mobile Category</th>
		<th>Online Availability</th>
	</tr>
<tr>
<td>${temp.mobId}</td>
<td>${temp.mobName}</td>
<td>${temp.price}</td>
<td>${temp.mobCategory}</td>
<td>${temp.online}</td>
</tr>

</table>

</body>
</html>