<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="v" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<v:form action="update1" method="post" modelAttribute="idd">
Mobile Id : <v:input path="mobId"/><br>
Updated Price : <v:input path="price"/><br>
<input type="submit" value="Update"/>
</v:form>
</body>
</html>