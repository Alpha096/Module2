<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scheduled Sessions</title>
</head>
<body>
<h1>Scheduled Sessions</h1>

<!-- Creating table to display all the entries retrieved from database -->

<table>
<tr>
<th>SessionName</th>
<th>Duration(Days)</th>
<th>Faculty</th>
<th>Mode</th>
<th></th>

</tr>
<a:forEach var="b" items="${data}">
<tr>
<td>${b.name}</td>
<td>${b.duration}</td>
<td>${b.faculty}</td>
<td>${b.mode1}</td>
<td><a href="success?name=${b.name}">Enroll Me</a></td>  <!-- Passes on the 'name' parameter to the controller -->
</a:forEach>

</table>
</body>
</html>