package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


public class C02Servlet_Test extends HttpServlet{
	@Override
	public void init() throws ServletException {
		// 최초 1회 실행
		System.out.println("INIT!!");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// 요청시마다 실행
		System.out.println("SERVICE!!");
	}

	@Override
	public void destroy() {
		// 서블릿 내용 수정 (코드 수정)
		// 종료시 , 재시작시...!!!
		System.out.println("DESTROY!!");
	}




}
