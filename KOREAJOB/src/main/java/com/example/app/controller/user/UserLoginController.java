package com.example.app.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.controller.SubController;
import com.example.app.domain.common.service.UserServiceImpl;

public class UserLoginController implements SubController {

	private UserServiceImpl userServiceImpl;
	
	public UserLoginController() {
		System.out.println("UserLoginController's Constructor invoke");
		try {
			userServiceImpl = UserServiceImpl.getInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			//GET MAPPING 
			String method = request.getMethod();
			if(method.contains("GET")) {
				request.getRequestDispatcher("/WEB-INF/view/user/login.jsp").forward(request, response);
				return ;
			}
			
			//01
			
			//02
			
			//03
			
			//04
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
