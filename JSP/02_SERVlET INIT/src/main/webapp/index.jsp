<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<style>
		/* (p) 전체 스타일 */
		*{margin :5px;}
		/* (p) 헤더 스타일 */
		.wrapper>header{
			height : 150px; border:1px solid;
		}
		.wrapper>header>.top-header{
			height:45px;
			border : 1px solid;	
			
		}
		.wrapper>header>.top-header>ul{
			display:flex;
			justify-content: right;
			align-items : center;
			list-style:none;
			padding : 0px;
		}
		.wrapper>header>.top-header>ul>li{
			width : 120px;
			height : 100%;
		}
		.wrapper>header>nav{
			height:75px;
			border : 1px solid;
		}
		/* (p) 메인스타일 */
		.wrapper>main{
			height:500px; border : 1px solid;
		}
		.wrapper>footer{
			height : 300px; border : 1px solid;
		}
	</style>
<body>

	<div class="wrapper">
		<header>
			<!-- (p) 파일 불러오기 -->
			<%@include file="fragments/topHeader.jsp" %>
			<%@include file="fragments/nav.jsp" %>
		</header>
		<main>
			<section></section>
			<section></section>
			<section></section>
		</main>
		<footer>
			<!-- (p) 파일 불러오기 -->
			<%@include file="fragments/footer.jsp" %>
		</footer>
	</div>
	<%
		/* (p) msg 받기 */
        String msg = (String) session.getAttribute("msg");
        if (msg != null && !msg.isEmpty()) {
    %>
    <script>
    	// (p) 메세지 출력
        alert("<%= msg %>");
    </script>
    <% 
    	// (p) 세션에서 메세지 삭제
        session.removeAttribute("msg");
        } 
    %>
	
</body>
</html>