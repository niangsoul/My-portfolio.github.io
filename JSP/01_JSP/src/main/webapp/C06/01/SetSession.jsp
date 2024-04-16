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
		// session
		/* 세션에 값 지정 */
		session.setAttribute("ID", "USER");
		session.setAttribute("ROLE", "ROLE_ADMIN");
		
		// request
		/* request 에 값 지정 */
		request.setAttribute("ID2", "USER1");
		request.setAttribute("ROLE2", "ROLE_MEMBER");
	%>
	<a href="GetSession.jsp">세션 정보확인</a>
</body>
</html>