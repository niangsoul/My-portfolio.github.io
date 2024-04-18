package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//URI : /loin
//service함수를 를 이용해서 login 처리하세요
//유효성 검증 실패시 /WEB-INF/error.jsp 로 포워딩 (에러메시지도 같이보여주면 좋고..아니어도 패스)
//회원가입 성공시 Main.jsp 로 리다이렉트 
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	// Get (회원가입 페이지로 이동)
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Get /login...");
			req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
		}

		// Post (회원가입 처리)
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Post /login...");
			
			// 1 파라미터 받기
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
			// 2 유효성 체크
			if(!isValid(username,password)) {
				resp.sendRedirect("login.jsp");
				return;
			}
			
			// 3 서비스
			HttpSession session =  req.getSession();

			// (p) 세션에 저장
			session.setAttribute(username, username);
			session.setAttribute(password, password);
			
			// 4 뷰
			// (p) 메세지 출력
			session.setAttribute("msg", "로그인에 성공하셨습니다.");
			// (p) 인덱스페이지로 이동
			resp.sendRedirect("index.jsp");
		}
		
		// (p) 유효성체크 하는곳
		private boolean isValid(String username, String password) {
			
			return true;
		}
}