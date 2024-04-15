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
	String userid = request.getParameter("userid");
	String pwd = request.getParameter("pwd");
	String value1 = (String) request.getAttribute("02page");
	String value2 = (String) request.getAttribute("03page");
	System.out.println("=============================");
	System.out.println("[04Page] userid : " + userid);
	System.out.println("[04Page] pwd : " + pwd);
	System.out.println("[04Page] 02Page : " + value1);
	System.out.println("[04Page] 03Page : " + value2);
	System.out.println("=============================");
	%>
</body>
</html>