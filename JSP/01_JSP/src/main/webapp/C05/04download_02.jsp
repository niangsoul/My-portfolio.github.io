<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.io.*,java.util.zip.*" %>
<%
	//Download Path확인
	String realPath = pageContext.getServletContext().getRealPath("/") + "C05\\download\\";
	System.out.println("RealPath : " + realPath);
	
	
	try{
		File dir = new File(realPath); //File dir 경로 설정
		File filelist[] = dir.listFiles(); //dir 안 모들 파일정보를 File 배열형태로 받기
		
		for(int i=0;i<filelist.length;i++){
			System.out.println(filelist[i]);
		}
		
		FileInputStream fin = null;
		ZipEntry zipEntry = null;	//Zip 묶여지는 단일파일 단위 



		//response 전달 파일타입 변경
		response.setHeader("Content-Type","application/octet-stream;charset=utf-8");
		response.setHeader("Content-Disposition","attachment; filename=TEST.zip");
		
		//[오류해결] 이 응답을 위해 getOutputStream()이 이미 호출되었습니다.
		out.clear(); //response outstream 을 닫고 버퍼를 비움 
		out = pageContext.pushBody(); //현재 페이지 body 연결
		
		ServletOutputStream bout = response.getOutputStream();
		
		//추가
		ZipOutputStream zout = new ZipOutputStream(bout);

		for (File file : filelist)
		{
			fin = new FileInputStream(file);
			ZipEntry zip = new ZipEntry(file.getName().toString());
			zout.putNextEntry(zip);
			/* 무한 반복문 */
			while (true) 
			{
				// 파일 읽기
				int data = fin.read();
				/* 반복문 멈추기 */
				if (data == -1)
					break;
				zout.write((byte) data);
			}
			
			zout.closeEntry();
			fin.close();
		}
		zout.close();
	} catch (Exception e) {

	}

%>

</body>
</html>





