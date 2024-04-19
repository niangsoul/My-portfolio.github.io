package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test1")
public class C01Servlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// (p) PrintWriter 생성
		PrintWriter out = resp.getWriter();
		// (p) 속성 받아오기
		String val = (String)req.getServletContext().getAttribute("CTX_ATTR1");
		 
		out.println("<h1>ServletContextListner TEST</h1>");
		out.println("CTX_ATTR1 : " + val);
	}

}
