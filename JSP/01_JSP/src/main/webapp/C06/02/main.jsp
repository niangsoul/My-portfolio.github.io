<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 입력받은 ID , ROLE 출력 -->
	USERNAME : <%=session.getAttribute("ID") %><br>
	ROLE : <%=session.getAttribute("ROLE") %><br>
	
	<h1>MAIN</h1>

	<!-- 로그아웃 버튼 -->
	<a href="logoutProc.jsp">로그아웃</a>
</body>
</html>