<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<!-- (p) 메세지 호출 -->
		MESSAGE : ${msg }
	</div>
	<!-- (p) login.do 에 get 방식으로 전달 -->
	
	<form action="${pageContext.request.contextPath }/login.do">
		<!-- (p) 텍스트 입력하는곳 -->
		<input type="text" name="username">
		<input type="text" name="password">
		<button>요청</button>
	</form>
	
	<%
		/* (p) 세션에서 msg 삭제 */
		session.removeAttribute("msg");
	%>
</body>
</html>