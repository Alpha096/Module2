<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Mobile</title>
</head>
<body>
<table border="1">
	<fo:form action="adddata" method="post" modelAttribute="my">	
		<tr>
			<td>Mobile ID</td>
			<td><fo:input path="mobId"/><fo:errors path="mobId"></fo:errors>
		</tr>
		
		<tr>
		<td>Mobile Name</td>
			<td><fo:input path="mobName"/><fo:errors path="mobName"></fo:errors>
		 </tr>
		 
		 <tr>
			<td>Mobile Price</td>
			<td><fo:input path="price"/>
			<fo:errors path="price"></fo:errors>
		</tr>
		
		 <tr>
			<td>Mobile Category</td>
			<td><fo:select path="mobCategory" items="${cato}"/>
		</tr>
		
		<tr>
			<td>Online Availabilty</td>
			<td><fo:radiobutton path="online" value="yes"/>Yes
			<fo:radiobutton path="online" value="no"/>No
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center"><input type="submit" value="Add Mobile"/></td>
		</tr>
	</fo:form>
</table>

</body>
</html>