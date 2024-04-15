<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="02Error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//문자열
	String num = request.getParameter("num");
	String div = request.getParameter("div");
	int n = Integer.parseInt(num);
	int d = Integer.parseInt(div);
	
%>
RESULT : <%=(n/d) %><br>

</body>
</html>