<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	#successPrint{
		margin-top:300px;
	}
</style>
<script type = "text/javascript">

	function down(){		
		
		var a = document.getElementById("successPrint");
		a.innerHTML = "Successs";
		window.sessionStorage['submit'] = document.getElementById('successPrint').innerHTML= "Success";
		window.stop();
	}
	
</script>

<title>Deposit</title>
</head>
<body>
<table border="2">
<f:form action="#" method="post" modelAttribute="depo" onsubmit="down()" >

<tr>
<td>Enter Mobile number:</td>
<td><f:input path="mobileNo"/>
</tr>

<tr>
<td>Enter Amount to deposit:</td>
<td><f:input path="initialBalance"/>
</tr>

<tr><td><button type="submit" >Deposit</button></td></tr>
</f:form>
</table>
<p id="successPrint"></p>
</body>
</html>
