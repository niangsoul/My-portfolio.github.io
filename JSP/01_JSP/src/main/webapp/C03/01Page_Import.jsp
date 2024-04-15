<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@page import="java.util.Scanner,C03.*" %>
<%
	Scanner sc = new Scanner(System.in);
	SimpleDto dto = new SimpleDto("hong",44,"대구");
%>

SIMPLEDTO : <%=dto %>

</body>
</html>