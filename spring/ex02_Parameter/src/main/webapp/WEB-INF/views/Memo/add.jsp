<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>MEMO</title>
	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
</head>
<body class="m-2 p-2">
	
		<div class="container">
			
			<form action="${pageContext.request.contextPath}/memo/add" method="post">
				<div class="m-2 w-50">
					<h1> MEMO</h1>
				</div>
				<div  class="m-2 w-50">
					<div>${id} </div>
					<input name="id" placeholder="insert id" class="form-control"	/>			
				</div>				
				<div class="m-2 w-50">
					<div>${text} </div>
					<textarea name="text" placeholder="insert memo" class="form-control"></textarea>				
				</div>
				<div  class="m-2 w-50">
					<div>${writer} </div>
					<input name="writer" placeholder="insert writer" class="form-control"	/>			
				</div>
				<div  class="m-2 w-50">
					<div>${regDate} </div>
					<!-- <input  type="datetime-local" name="regdate" placeholder="yyyy-MM-dd hh:mm:ss" class="form-control"	/>	 -->		
					<input   name="regdate" placeholder="yyyy-MM-dd hh:mm:ss" class="form-control"	/>	
				</div>		
				<div class="m-2 w-50">
					<input type="submit" class="btn btn-success" />
				</div>							
			</form>
		</div>

</body>
</html>