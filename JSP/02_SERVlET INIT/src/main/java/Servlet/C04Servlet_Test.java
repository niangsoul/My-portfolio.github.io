package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/join.do")
public class C04Servlet_Test extends HttpServlet{

	// Get (회원가입 페이지로 이동)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get /Join.do...");
		req.getRequestDispatcher("/WEB-INF/Join.jsp").forward(req, resp);
	}

	// Post (회원가입 처리)
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post /Join.do...");
		
		// 1 파라미터 받기
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		// 2 유효성 체크
		if(!isValid(username,password)) {
			return;
		}
		
		// 3 서비스
		HttpSession session =  req.getSession();

		// (p) 세션에 저장
		session.setAttribute(username, username);
		session.setAttribute(password, password);
		
		// 4 뷰
		// (p) 메인페이지로 이동
		resp.sendRedirect("Main.jsp");
	}
	
	// (p) 유효성체크 하는곳
	private boolean isValid(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
