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
	쿠키
	문자열 데이터로만 저장가능
	4kbyte 이하의 공간을 차지
	여러개의 쿠키 설정가능(최대 300개)
	도매인당 20개 까지 저장가능
	저장한도를 초과하면 최근에 사용되지 않는 쿠키부터 자동 삭제
 -->

<%
	Cookie cookie = new Cookie("myCookie1","cookieValue1");
	cookie.setMaxAge(60);		// 쿠키 유지시간 | -1(기본값) : 파일생성은 되지 않으나 브라우저가 종료될때 까지 쿠키정보 저장
								// 브라우저 종료시 삭제
	Cookie cookie2 = new Cookie("myCookie2","cookieValue2");
	cookie2.setMaxAge(60*60);	// 쿠키 유지시간
	
	// 쿠키 전달
	response.addCookie(cookie);
	response.addCookie(cookie2);
%>

</body>
</html>