package com.example.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements SubController {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("HomeController's execute() invoke..");
		
		try {
			
			request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
		
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
