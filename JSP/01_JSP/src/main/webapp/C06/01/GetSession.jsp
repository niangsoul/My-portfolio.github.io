<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- session 호출 -->
	session값 :
	<%=session.getAttribute("ID")%>
	|
	<%=session.getAttribute("ROLE")%><br> 
	<!-- request 호출 -->
	request값 :
	<%=request.getAttribute("ID2")%>
	|
	<%=request.getAttribute("ROLE2")%><br>

</body>
</html>