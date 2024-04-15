<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--  
	Forward방식 페이지 요청 : Request는 유지한채 또다른 URI경로로 이동
	주소창의 URL경로는 최초요청시의 URL로 유지된다
	Request객체의 내용은 최초요청내용이 유지된다.
-->
		<form action="02Page.jsp">
			<input type="text" name=userid />
			<input type="text" name=pwd />
			<input type="submit" />
		</form>
	

</body>
</html>