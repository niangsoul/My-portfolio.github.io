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
 
 	//Redirect 방식 페이지요청
 	//response.sendRedirect(경로) 
 	//새로운 reuqest 요청 경로를 전달함으로써 기존 request값은 제거
 	//URL정보도 최종 요청한 경로로 지정 

 -->
	<form action="02Page.jsp">
		<input type="text" name=userid />
		<input type="text" name=pwd />
		<input type="submit" />
	</form>

</body>
</html>