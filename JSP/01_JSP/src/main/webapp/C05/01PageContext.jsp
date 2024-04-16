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
		System.out.println("pageContext : " + pageContext);
		System.out.println("pageContext : " + pageContext.getRequest());							// Request 객체 꺼내옴
		System.out.println("pageContext : " + pageContext.getResponse());							// Response 객체 꺼내옴
		System.out.println("pageContext : " + pageContext.getSession());							// Session 객체 꺼내옴
		System.out.println("pageContext : " + pageContext.getServletContext());						// ServletContext 객체 꺼내옴
		System.out.println("pageContext : " + pageContext.getServletContext().getContextPath());	// ProjectPath 객체 꺼내옴
	%>
	
	PROJECT PATH : ${pageContext.request.contextPath}<br>
</body>
</html>