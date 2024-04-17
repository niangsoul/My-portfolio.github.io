<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
	// 쿠키 생성 (p)
	Cookie [] cookies = request.getCookies();
	// 이름 아이디체크 널값 설정 (p)
	String username=null;
	String idchk=null;
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("idchk"))
			idchk = cookie.getValue();
		if(cookie.getName().equals("username"))
			username = cookie.getValue();
	}
	
%>

<body>
		<!-- post 방식으로 전달 (p) -->
		<form action="loginProc.jsp" method="post">
		<!-- 이름 , 비밀번호 작성 (p) -->
			<input type="text" name="username" 	value='<%=(idchk!=null) ? username : "" %>'	/> <br>
			<input type="password" name="password" 	/> <br>
			<!-- id 저장칸 (p) -->
			<input type="checkbox" name="idchk"> ID저장 <br>
			<!-- 로그인 버튼 (p) -->
			<button>로그인</button>
		</form>
		
		
		<script>
		  const message =  "<%=session.getAttribute("msg")%>";
		  console.log(message);
		  console.log(typeof message);
		  // 널이 아닌지 확인 (p)
		  if(message!=="null")
			  // 메세지 화면에 뛰우기 (p)
				alert(message);		 
		  
		  // 세션<msg> 삭제 (p)
		  <% session.removeAttribute("msg"); %>
		  sessionStorage.setItem('msg',message);
		</script>
		
		
</body>
</html>