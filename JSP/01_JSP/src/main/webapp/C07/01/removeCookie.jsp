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
		// 파라미터 받기 (p)
		String cookiename = request.getParameter("cookiename");
		// 쿠키 생성 (p)
		Cookie cookie = new Cookie(cookiename,"");
		// 쿠키 지속시간 설정 0초 (p)
		cookie.setMaxAge(0);
		// 쿠키 전달 (p)
		response.addCookie(cookie);
	%>
	<!-- 쿠키 확인 하이퍼 링크 (p) -->
	<a href="confirmCookie.jsp">쿠키확인</a>
</body>
</html>