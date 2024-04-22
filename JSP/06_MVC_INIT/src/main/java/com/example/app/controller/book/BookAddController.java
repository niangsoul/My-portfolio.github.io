package com.example.app.controller.book;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.controller.SubController;

public class BookAddController implements SubController{
	// (p) HTML 서블릿 요청 , 응답
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BookAddController's execute() invoke ");
		
	}
	

}
