<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Withdraw</title>
</head>
<body>
<table border="2">
<a:form action="withdrawamt" method="post" modelAttribute="with">

<tr>
<td>Enter Mobile number:</td>
<td><a:input path="mobileNo"/>
</tr>

<tr>
<td>Enter Amount to withdraw:</td>
<td><a:input path="initialBalance"/>
</tr>

<td><input type="submit" value="Withdraw" /></td>
</a:form>

</table>

</body>
</html>