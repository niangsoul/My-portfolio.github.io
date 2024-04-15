<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>03PAGE</h1>
	
		<% 
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		System.out.println("---------03Page---------");
		System.out.println("userid : " + userid);
		System.out.println("pwd : " + pwd);
		System.out.println("---------03Page---------");
		
		//02에서 전달하는 속성 확인하기
		String Page02_value = (String)request.getAttribute("02Page");
		//Forwarding
		//request.getRequestDispatcher("03Page.jsp").forward(request,response);
		%>
		USERID : <%=userid %><br/>
		PWD : <%=pwd %><br/>
		Page02_VALUE : <%=Page02_value %><br/>
	
</body>
</html>