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
	선언문(서블릿으로 변환되는 자바파일의 속성/기능추가)
 -->
 	<%! 
 		String name="Hong gil Dong";
 		public String testFunc(){
 			System.out.println("선언문 TEST");
 			return "HELLO WORLD";
 		}
 	%>

<!--  
	표현식(HTML 로 표시/표현할때 사용되는 코드)
-->
	<%=name %><br>
	<%=testFunc() %><br>
	
	
</body>
</html>