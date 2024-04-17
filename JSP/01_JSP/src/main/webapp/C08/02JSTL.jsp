<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html></html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body></body>
	<!-- 변수선언 -->
	<c:set var="num" value="123" />
	
	<!-- 변수 출력 -->
	<c:out value="${num}" /> <br>
	NUM : ${num} <br>
	<hr>
	<!-- 변수 지정 -->
	<c:set var="arr" value="${[10,20,30,40,50]}" />
	<c:out value="${arr}" /><br>
	<c:out value="${arr[1]}" /> <br>
	
	<hr>
	
	<!-- if -->
<%-- 	<c:set var="flag" value=true /> --%>
	<c:if test="${empty flag }">
		<c:out value="flag false!!" />
	</c:if>
		<c:if test="${not empty flag }">
		<c:out value="flag true!!" />
	</c:if>
	<hr>
	
	<!-- choose when -->
	<c:set var="str" value="c" />
	<c:choose>
		<c:when test="${str eq 'a' }">
		<c:out value="[CHOOSE] A" />
		</c:when>
		<c:when test="${str eq 'b' }">
		<c:out value="[CHOOSE] V" />
		</c:when>
		<c:when test="${str eq 'c' }">
		<c:out value="[CHOOSE] C" />
		</c:when>
		<c:otherwise>
		<c:out value="[CHOOSE] ETC" />
		</c:otherwise>
	</c:choose>
	
	<!-- for Each -->
	<c:set var="end" value="15" />
	<c:forEach var="i" begin="1" end="${end}" step="2">
		<c:out value="${i}" /> |
		</c:forEach>
		<hr/>
		
		
		<!-- 변수선언<문자열> (p) -->
		<c:set var="arr2" value="${['aaa','bbb','ccc','ddd','eee']}" />
		
		<c:forEach var="item" items="${arr2}" varStatus="status">
			${status.index} . ${item } : ${status.count } <br>
		</c:forEach>
		
		