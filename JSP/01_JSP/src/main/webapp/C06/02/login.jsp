<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 입력란 코드 -->
	<form action="loginProc.jsp" method="post">
		<input type="text" name="username" /> <br> <input type="text" name="password" /> <br>
		<!-- 전송버튼 -->
		<button>로그인</button>
	</form>

		<script>
		/* 메세지 받아서 호출 */
		  const message =  "<%=session.getAttribute("msg")%>";
		  console.log(message);
		  console.log(typeof message);
		  if(message!=="null")
				alert(message);		 
		  
		  <% session.removeAttribute("msg"); %>
		</script>

</body>
</html>