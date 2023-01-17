<%@page import="com.thari.project.entity.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%Admin admin=(Admin) session.getAttribute("admin"); %>
<%if(admin!=null){%>
Welcome to Admin Menu<br><br>
<a href="adminLogout.jsp">
<button>LogOut</button>
</a>
<%}else{%>
Please Provide valid user and password
<%} %>



</body>
</html>