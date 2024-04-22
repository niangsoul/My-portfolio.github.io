<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<!-- link  -->
	<%@ include file="/resources/static/jsp/link.jsp" %>
	
	<!-- common.css -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common.css" />
	
	<!-- common.js -->
	<script src="${pageContext.request.contextPath}/resources/static/js/common.js" defer></script>
	
	<!-- book/list.css -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/book/list.css" />
	
	<!-- book/list.js -->
	<script src="${pageContext.request.contextPath}/resources/static/js/book/list.js" defer></script>
	
</head>

<body>
	
	<div class="wrapper">
		<header>
			
			<!-- top-header -->
			<%@ include file="/resources/static/jsp/topHeader.jsp" %>
			<!-- nav -->
			<%@ include file="/resources/static/jsp/nav.jsp" %>

		</header>
       <main class=layout-150>

            <section class=breadcrum-block>
	            <nav style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
				  <ol class="breadcrumb">
				    <li class="breadcrumb-item"><a href="#">HOME</a></li>
				    <li class="breadcrumb-item active" aria-current="page">BOOK_LIST</li>
				  </ol>
				</nav>
            </section>
            
            <section class="search-block">
       
            	<form action="">          		
            		<div class="m-2">
	            		<select name="keyfield" id="" class="form-select">
	            			<option value="bookCode" selected>bookCode</option>
	            			<option value="bookName">bookName</option>
	            			<option value="publisher">publisher</option>
	            			<option value="isbn">isbn</option>
	            		</select>
            		</div>
            		<div class="m-2">
            			<input name="keyword" placeholder="KEYWORD" class="form-control">
            		</div>	
            		<div class="m-2">
            			<button class="btn btn-secondary">조회</button>
            		</div>
            	</form>
            </section>

            <section>
            	<%-- ${pageDto} --%>
         	<div>
         	
            		<div>TOTAL : <span> 1000</span> </div>
            		  
            		<div>NOW : <span> 1</span> </div>
            	</div> 
            </section>
            
            <section class="show-block">
            	<table class=table>
            		<tr>
            			<td>BOOKCODE</td>
            			<td>BOOKNAME</td>
            			<td>PUBLISHER</td>
            			<td>ISBN</td>
            		</tr>
	            	<tr>	
							<td>1111</td>
							<td>-제목</td>
							<td>--출판사</td>
							<td>111-1111</td>
					</tr>
	            	<tr>	
							<td>1111</td>
							<td>-제목</td>
							<td>--출판사</td>
							<td>111-1111</td>
					</tr>	
	            	<tr>	
							<td>1111</td>
							<td>-제목</td>
							<td>--출판사</td>
							<td>111-1111</td>
					</tr>																	
																
            	</table>      
            </section>
            
            <!-- paging -->
            <section>
	            	<nav aria-label="Page navigation example">
					  <ul class="pagination">
					    <!-- prev -->
					    
					    
						<li class="page-item">
							   <a class="page-link" href="" aria-label="Previous">
							        <span aria-hidden="true">&laquo;</span>
							   </a>
						</li>        
					    
					    
					    <!-- paging -->
						
						<li class="page-item"><a class="page-link" href="">1</a></li>
						<li class="page-item"><a class="page-link" href="">2</a></li>
						<li class="page-item"><a class="page-link" href="">3</a></li>
						<li class="page-item"><a class="page-link" href="">4</a></li>
						
					    
					    <!-- next -->
					  
						<li class="page-item">
							      <a class="page-link" href="" aria-label="Next">
							        	<span aria-hidden="true">&raquo;</span>
							      </a>
						</li>
 
					  </ul>
					</nav>
            </section>
            
        </main>
        
        
        
        <footer>  
        	<!-- footer  -->
			<%@ include file="/resources/static/jsp/footer.jsp" %>
       </footer>
        	
	</div>
		
</body>	
</html>