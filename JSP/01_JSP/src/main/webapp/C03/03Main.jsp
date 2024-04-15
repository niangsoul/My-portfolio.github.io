<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="03Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@page import="C03.*" %>
	<%
		String name = request.getParameter("username");
		int age = Integer.parseInt(request.getParameter("age"));
		String addr = request.getParameter("addr");
	
		if(name.isEmpty())
			throw new Exception("이름이 공백입니다..");
		if(age==0)
			throw new Exception("나이가 공백입니다..");
		if(addr.isEmpty())
			throw new Exception("주소가 공백입니다..");
		
		SimpleDto dto = new SimpleDto(name,age,addr);
		out.println(dto);
	%>
	

</body>
</html>