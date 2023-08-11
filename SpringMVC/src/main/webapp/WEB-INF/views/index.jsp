<%@page import="java.util.List"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<body>
<h2>Hello World!</h2>
<a href="about">About</a>
<a href="contact">Contact</a>
<%int num = (Integer)(request.getAttribute("num")); %>
<%out.print(num); %>
<h1>${num }</h1>
<%List<String> list = (List<String>)request.getAttribute("list"); %>
<%for(String s:list){ %>
	<%out.print(s); %>
<%} %>
<h2>${list }</h2>
<c:forEach items="${list }" var="s">
	<h1>${s }</h1>
</c:forEach>
<form action="register" method="get">
	<table>
		<tr><td>Name : </td><td><input type = "text" name="name"></td></tr>
		<tr><td>Contact : </td><td><input type = "text" name="contact"></td></tr>
		<tr><td><input type = "submit" name="action" value="register"></td></tr>
	</table>
</form>
</body>
</html>
