<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@page import="java.io.*" %>
	<%
		// 파일경로 확인
		String dirpath = pageContext.getServletContext().getRealPath("/") + "C05\\download\\";
		System.out.println("PATH : " + dirpath);
		
		try {
			// in
			FileInputStream in = new FileInputStream(dirpath + "test1.txt");
			
			//[오류 해결]
			out.clear();					// response outStream 을 닫고 버퍼를 비움
			out = pageContext.pushBody();	// 현재 페이지에 body 연결
			
			// out
			ServletOutputStream bout = response.getOutputStream();
			
			//respone Header 변경(*)
			response.setHeader("Context-Type", "application/octet-stream;charset-utf-8");
			response.setHeader("Content-Disposition", "attachment; filename=TEXT1.txt");
			
			/* 무한 반복문 */
			while(true) {
				// 파일 읽기
				int data = in.read();
				/* 반복문 멈추기 */
				if(data==-1) 
					break;
				bout.write((byte)data);
				bout.flush();
				

				
			}
			bout.close();
			in.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	%>
	
</body>
</html>