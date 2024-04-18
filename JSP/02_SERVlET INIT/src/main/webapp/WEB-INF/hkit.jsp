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
		<h1>회원가입</h1>
	<form action="${pageContext.request.contextPath }/hkit" method="post">
		<label>ID : </label><input type="text" name ="username"><br><br>
		<label>PW : </label><input type="text" name ="password"><br><br>
		<button>회원가입</button>
	</form>
	</main>
</div>
</html>