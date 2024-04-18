package Servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//URI : /login
//service함수를 를 이용해서 login 처리하세요
//유효성 검증 실패시 /WEB-INF/error.jsp 로 포워딩 (에러메시지도 같이보여주면 좋고..아니어도 패스)
//회원가입 성공시 Main.jsp 로 리다이렉트 

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Servlet /login..");
		}
		
	}

	
