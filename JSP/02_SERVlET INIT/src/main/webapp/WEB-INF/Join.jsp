<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JOIN</h1>
	<form action="${pageContext.request.contextPath }/join.do" method="post">
		<input type="text" name="username">
		<input type="text" name="password">
		<button>가입요청</button>
	</form>
</body>
</html>