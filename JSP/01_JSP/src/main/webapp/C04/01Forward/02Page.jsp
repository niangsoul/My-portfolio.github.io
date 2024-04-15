<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>02PAGE</h1>
	<% 
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		System.out.println("---------02Page---------");
		System.out.println("userid : " + userid);
		System.out.println("pwd : " + pwd);
		System.out.println("---------02Page---------");
		
		//새로운 속성값을 Request에 추가하기
		request.setAttribute("02Page","02Page_Value");
		
		//Forwarding
		request.getRequestDispatcher("03Page.jsp").forward(request,response);
		
		
		
	%>


</body>
</html>