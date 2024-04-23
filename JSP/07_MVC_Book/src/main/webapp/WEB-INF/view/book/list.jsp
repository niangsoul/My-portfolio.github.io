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
            
            <section class="search-block layout-150">
       
            	<form action="${pageContext.request.contextPath }/book/list">          		
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
            		<div>
            			<input type="hidden" name="pageNo" value="${pageDto.criteria.pageno }">
            		</div>
            		<div class="m-2">
            			<button class="btn btn-secondary">조회</button>
            		</div>
            	</form>
            </section>

            <section>
            	<%-- ${pageDto} --%>
         	<div>
         		<!-- (p)  페이지 번호 표시-->
     				<div>전체게시물 개수 : <span> ${count }</span> </div>
            		<div>전체페이지 개수 : <span> ${pageDto.totalpage }</span> </div>
            		<div>전체페이지 블럭 개수 : <span> ${pageDto.totalBlock }</span> </div>
            		<div>전체페이지 블럭 번호 : <span> ${pageDto.nowBlock }</span> </div>
            		<div>현재페이지 개수 : <span> ${pageDto.criteria.pageno }</span> </div>
            		  
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
            		
            		<c:forEach  var="bookDto"	items="${list}" varStatus="status">    		
		            	<tr>	
								<td>${bookDto.bookCode}</td>
								<td>${bookDto.bookName}</td>
								<td>${bookDto.publisher}</td>
								<td>${bookDto.isbn}</td>
						</tr>          		
            		</c:forEach>

									
            	</table>      
            </section>
            
            
            
            <!-- paging -->
            <section>
	            	<nav aria-label="Page navigation example">
					  <ul class="pagination">
					    <!-- prev -->
					    <!-- (p) 이전페이지 표시 -->
					   <c:if test="${pageDto.prev}">
	 						<li class="page-item">
								   <a class="page-link" href="${pageContext.request.contextPath}/book/list?pageNo=${pageDto.nowBlock*pageDto.pagePerBlock-pageDto.pagePerBlock*2+1}&type=${pageDto.criteria.type}&keyword=${pageDto.criteria.keyword}" aria-label="Previous">
								        <span aria-hidden="true">&laquo;</span>
								   </a>
							</li>  							
 						</c:if>
		    
					    
					    
					    <!-- paging -->
									<c:forEach 	var="pageNo"	begin="${pageDto.startPage}" end="${pageDto.endPage}" 	step="1">
							<li class="page-item">
								<a class="page-link" href="${pageContext.request.contextPath}/book/list?pageNo=${pageNo}&type=${pageDto.criteria.type}&keyword=${pageDto.criteria.keyword}">${pageNo}</a>
							</li>
						</c:forEach>
						

						
					    <!-- (p) 다음페이지 표시 -->
					    <!-- next -->
					 <c:if test="${pageDto.next}">
							<li class="page-item">
								      <a class="page-link" href="${pageContext.request.contextPath}/book/list?pageNo=${pageDto.nowBlock*pageDto.pagePerBlock+1}&type=${pageDto.criteria.type}&keyword=${pageDto.criteria.keyword}" aria-label="Next">
								        	<span aria-hidden="true">&raquo;</span>
								      </a>
							</li>
						</c:if>
		
 
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