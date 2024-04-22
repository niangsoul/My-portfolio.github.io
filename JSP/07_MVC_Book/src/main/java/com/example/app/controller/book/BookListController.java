package com.example.app.controller.book;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.controller.SubController;

public class BookListController  implements SubController{
	// (p) HTML 서블릿 요청 , 응답
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BookListController's execute() invoke");	
		
		// (p) 메소드 가져오기
		String method = request.getMethod();
		// (p) 겟 메소드 포함확인
		if(method.contains("GET")) {
			try {
				// (p) 요청전달
				request.getRequestDispatcher("/WEB-INF/view/book/list.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	


}
