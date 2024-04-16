<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 자바 임포트 -->
	<%@page import="java.io.*" %>
	<%
		// Redirect
		// response.sendRedirect("02Request.jsp");
	
		// 새로고침
		// response.setIntHeader("refresh", 3);
		
		// ServletOutputStream bout =  response.getOutputStream();
		// 유니코드 문자 97번 대입
		// bout.write(97);
		// bout.flush();
		// bout.close();
		
		// PrintWriter 사용 (Out내장객체와 유사)
		PrintWriter o = response.getWriter();
		
		out.println("<h1>TEST</h1>");
		o.println("<h2>TEST2</h2>");
	%>
	<!-- 자바 임포트 -->
	<%@page import="java.util.*" %>
	<%=new Date() %>
	
</body>
</html>