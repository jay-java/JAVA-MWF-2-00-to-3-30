<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
User u = null;
if(session.getAttribute("data")!=null){
	 u = (User)session.getAttribute("data");
}
else{
	response.sendRedirect("login.jsp");
}
%>
<h1>Welcome, </h1><h3><%=u.getName() %></h3>
<h1><a href="logout.jsp">Logout</a></h1>
</body>
</html>