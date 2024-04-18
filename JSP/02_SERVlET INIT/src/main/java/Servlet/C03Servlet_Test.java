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
//(p) 웹서블릿 호출
@WebServlet("/login.do")
public class C03Servlet_Test extends HttpServlet{
	// (p) do Get 방식 호출
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");
		
		// 1 파라미터 받기
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		// 2 유효성 체크
		if(!isValid(username,password)) {
			return;
		}
		
		// 3 서비스
		// (p) id 맞는지 체크
		HttpSession session =  req.getSession();
		if(!username.equals("user1")) {
			session.setAttribute("msg","USERID를 올바르게 입력하세요");
			req.getRequestDispatcher("Request_Get.jsp").forward(req, resp);;
			
			return;
		}
		// (p) pw 맞는지 체크
		if(!password.equals("1234")) {
			session.setAttribute("msg","PASSWORD를 잘못 입력 하셧습니다.");
			req.getRequestDispatcher("Request_Get.jsp").forward(req, resp);;
			
			return;
		}
		// (p) 세션에 저장
		session.setAttribute(username, username);
		session.setAttribute(password, password);
		
		// 4 
		// (p) 메인페이지로 이동
		resp.sendRedirect("Main.jsp");
		
	}

	private boolean isValid(String username, String password) {
		if(username==null)
			return false;
		else if (password==null)
			return false;
		return true;
	}

	@Override
	// (p) do Post 방식 호출
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost");
		
		// 1 파라미터 받기
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		// 2 유효성 체크
		if(!isValid(username,password)) {
			return;
		}
		
		// 3 서비스
		// (p) id 맞는지 체크
		HttpSession session =  req.getSession();
		if(!username.equals("user1")) {
			session.setAttribute("msg","USERID를 올바르게 입력하세요");
			req.getRequestDispatcher("Request_Get.jsp").forward(req, resp);;
			
			return;
		}
		// (p) pw 맞는지 체크
		if(!password.equals("1234")) {
			session.setAttribute("msg","PASSWORD를 잘못 입력 하셧습니다.");
			req.getRequestDispatcher("Request_Get.jsp").forward(req, resp);;
			
			return;
		}
		// (p) 세션에 저장
		session.setAttribute(username, username);
		session.setAttribute(password, password);
		
		// 4 
		// (p) 메인페이지로 이동
		resp.sendRedirect("Main.jsp");
	}

//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("service");		
//	}

	@Override
	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public void init() throws ServletException {
		// (p) 최초 실행시 실행
		System.out.println("init");
	}
	
}
