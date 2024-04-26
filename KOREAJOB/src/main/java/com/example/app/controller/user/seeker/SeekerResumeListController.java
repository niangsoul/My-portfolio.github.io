package com.example.app.controller.user.seeker;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.controller.SubController;
import com.example.app.domain.seeker.service.SeekerServiceImpl;

public class SeekerResumeListController implements SubController {

	private SeekerServiceImpl seekerServiceImpl;
	
	public SeekerResumeListController() {
		System.out.println("SeekerResumeListController Constructor invoke");

		try {
			seekerServiceImpl = SeekerServiceImpl.getInstance();
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
				request.getRequestDispatcher("/WEB-INF/view/seeker/resume/list.jsp").forward(request, response);
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
