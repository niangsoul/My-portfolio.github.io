<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>

<%
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("행열 입력 : ");
	int row = sc.nextInt();
	int col = sc.nextInt();
	System.out.print("행 : " + row + " 열 : " + col);

%>
행 : <%=row %><br>
열 : <%=col %><br>
<hr>
	
	<table class="table">
	
		<%
		int cnt=1;
		for(int i=0;i<row;i++)
		{
		%>
			<tr>
			<%
			for(int j=0;j<col;j++)
			{
			%>
				<td><%=cnt++%></td>			
			<%
			}
			%>
			</tr>
			
		<% 
		}
		%>
	
	</table>


</body>
</html>