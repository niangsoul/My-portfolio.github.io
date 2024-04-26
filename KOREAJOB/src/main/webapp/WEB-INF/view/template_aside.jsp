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
	
	<!-- user/myinfo.css -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/user/myinfo.css" />
	
	<!-- common.js -->
	<script src="${pageContext.request.contextPath}/resources/static/js/common.js" defer></script>
</head>

<body>
	
	<div class="wrapper">
		<header>
			
			<!-- top-header -->
			<%@ include file="/resources/static/jsp/topHeader.jsp" %>
			<!-- nav -->
			<%@ include file="/resources/static/jsp/nav.jsp" %>

		</header>
       	
       	
       	<main class="layout-150">
       		
       		
       		
            <section class=breadcrum-block>
	            <nav style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
				  <ol class="breadcrumb">
				    <li class="breadcrumb-item"><a href="#">HOME</a></li>
				    <li class="breadcrumb-item active" aria-current="page">MYINFO(ROLE_USER)</li>
				  </ol>
				</nav>
            </section>
            <section>
            	<div class="main-block">
            		<aside class=left>
              			<div>
            				<ul>
            					<li><a href=> menu 01</a></li>
	            				<li><a href=> menu 02</a></li>
	            				<li><a href=> menu 03</a></li>
	            				<li><a href=> menu 04</a></li>
	            				<li><a href=> menu 05</a></li>
            				</ul>
            			
            			</div>          		
            		
            		
            		</aside>
            		<div class=right>
            		            <div class="breadcrum-block mb-3">
						            <nav style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
									  <ol class="breadcrumb">
									    <!-- <li class="breadcrumb-item"><a href="#">HOME</a></li> -->
									    <li class="breadcrumb-item active" aria-current="page">도서신청 확인<li>
									  </ol>
									</nav>
					            </div>
            					
            					<div>
            					
            						
            					</div>
            		
            		</div>	
            	</div>
       		
            </section>
            <section></section>
            <section></section>
            <section></section>
            
        </main>
        
        
        <footer>
        	<!-- footer  -->
			<%@ include file="/resources/static/jsp/footer.jsp" %>
       </footer>
        	
	</div>
		
</body>	
</html>