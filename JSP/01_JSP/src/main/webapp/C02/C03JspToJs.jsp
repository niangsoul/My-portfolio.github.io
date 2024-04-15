<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String msg1 = "HELLO WORLD1";
	String msg2 = "HELLO WORLD2";
	String msg3 = "HELLO WORLD3";
	String msg4 = "HELLO WORLD4";
%>

<script>	

	const message1 = '<%=msg1%>';
	const message2 = '<%=msg2%>';
	const message3 = '<%=msg3%>';
	const message4 = '<%=msg4%>';

	console.log(message1);
	console.log(message2);
	console.log(message3);
	console.log(message4);
	
</script>

</body>
</html>