<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%
// 파라미터 받기
String username = request.getParameter("username");
String password = request.getParameter("password");

// 유효성 체크
if(username==null || username.isEmpty()){
		session.setAttribute("msg","ID입력은 필수 사항입니다.");
		/* 페이지 이동 */
		response.sendRedirect("login.jsp");
		return ;
	}
	if(password==null || password.isEmpty()){
		session.setAttribute("msg","PW입력은 필수 사항입니다.");
		/* 페이지 이동 */
		response.sendRedirect("login.jsp");
		return ;
	}
	if(!username.equals("USER1")){
		session.setAttribute("msg","ID가 일치하지 않습니다.");
		/* 페이지 이동 */
		response.sendRedirect("login.jsp");
		return ;
	}
	if(!password.equals("1234")){
		session.setAttribute("msg","PW가 일치하지 않습니다.");
		/* 페이지 이동 */
		response.sendRedirect("login.jsp");
		return ;
	}
// 세션에 개인정보 저장
session.setAttribute("ROLE", "ROLE_USER");
session.setAttribute("ID", username);
session.setMaxInactiveInterval(60*60);		// 초단위 기본 30분(1800초)
response.sendRedirect("main.jsp");
%>

