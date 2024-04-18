package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//URI : /join
//doGet / doPost 를 이용해서 Join 처리하세요
//유효성 검증 실패시 /WEB-INF/error.jsp 로 포워딩
//회원가입 성공시 /login 으로 리다이렉트 
@WebServlet("/hkit" )

public class JoinServlet extends HttpServlet{
	// Get (회원가입 페이지로 이동)
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Get /hkit...");
			req.getRequestDispatcher("/WEB-INF/hkit.jsp").forward(req, resp);
		}

		// Post (회원가입 처리)
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Post /hkit...");
			
			// 1 파라미터 받기
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
			
			// 2 유효성 체크
			if(!isValid(username,password)) {
				resp.sendRedirect("hkit.jsp");
				return;
			}
			
			// 3 서비스
			
			HttpSession session =  req.getSession();
			// (p) 세션에 저장
			session.setAttribute(username, username);
			session.setAttribute(password, password);
			
			// 4 뷰
			// (p) 메세지 출력
	        session.setAttribute("msg", "회원가입에 성공하였습니다. 로그인해주세요.");
	        // (p) 메인페이지로 이동
	        resp.sendRedirect(req.getContextPath() +  "/login");
		}
		
		// (p) 유효성체크 하는곳
		private boolean isValid(String username, String password) {
			
			return true;
		}
}