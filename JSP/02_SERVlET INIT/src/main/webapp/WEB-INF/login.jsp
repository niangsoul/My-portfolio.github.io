<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.header {
	position: relative;
	left: 450px;
	}
	.header>.top-header{
	height: 50px;
	width : 1000px;
	border: 1px solid;
	}
	.header>main {
	height: 500px;
	width : 1000px;
	border: 1px solid;
	text-align: center;
	}
	.header>main >h1{
		color : pink;
	}
	.header>main>form>label {
		color : aqua;
	}
</style>
</head>
<body>
<div class="header">
	<div class="top-header"></div>
	<main>
		<h1>login</h1>
	<form action="${pageContext.request.contextPath }/login" method="post">
		<label>ID : </label><input type="text" name ="username"><br><br>
		<label>PW : </label><input type="text" name ="password"><br><br>
		<button>로그인</button>
	</form>
	</main>
</div>
<%
        String msg = (String) session.getAttribute("msg");
        if (msg != null && !msg.isEmpty()) {
    %>
    <script>
        alert("<%= msg %>");
    </script>
    <% 
        session.removeAttribute("msg"); // 메시지를 표시한 후 세션에서 제거
        } 
    %>
</body>
</html>