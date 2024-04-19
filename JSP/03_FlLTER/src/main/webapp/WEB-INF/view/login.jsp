<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
	<h1>LOGIN</h1>
	<!-- (p) post 방식으로 전달 -->
	<form action="${pageContext.request.contextPath}/login" method="post">
	<!-- (p) 텍스트 작성란 -->
		<input type="text" name="username" /><br>
		<input type="text" name="password" /><br>
		<!-- (p) 전송 -->
		<button>로그인</button>
	</form>
</body>
</html>