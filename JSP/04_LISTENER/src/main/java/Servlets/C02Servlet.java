package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test2")
public class C02Servlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// (p) PrintWriter 생성
		PrintWriter out = resp.getWriter();
		// (p) 속성 생성
		req.getServletContext().setAttribute("CTX_ATTR2", "VAL2");
		// (p) 속성 받아오기
		String val = (String)req.getServletContext().getAttribute("CTX_ATTR1");
		String val2 = (String)req.getServletContext().getAttribute("CTX_ATTR2");
		
		out.println("<h1>ServletContextListner TEST2</h1>");
		out.println("CTX_ATTR1 : " + val);
		out.println("CTX_ATTR2 : " + val2);
	}

}
