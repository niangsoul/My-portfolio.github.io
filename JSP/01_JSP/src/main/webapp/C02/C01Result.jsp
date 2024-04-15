<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String bgColor = request.getParameter("bg");	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor=<%=bgColor %>>

	USERNAME : <%=username %><br>
	PASSWORD : <%=password %><br>
	
</body>
</html>