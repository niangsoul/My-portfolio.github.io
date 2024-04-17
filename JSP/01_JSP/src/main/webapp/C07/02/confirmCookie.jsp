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
		// 쿠키 생성 (p)
		Cookie[] cookies = request.getCookies();
	// 쿠키가 널값이 아닌지 확인 (p)
		if(cookies != null) {
			for(Cookie c : cookies) {
				%>
					<div>
					<!-- 쿠키 삭제 하이퍼 링크 (p) -->
					<a href="removeCookie.jsp?cookiename=<%=c.getName() %>">
					<!-- 이름 벨류 값 출력 (p) -->
					<%=c.getName() %> : <%=c.getValue() %>
					</a>
						
					</div>
				<%
			}
		}
	%>

</body>
</html>