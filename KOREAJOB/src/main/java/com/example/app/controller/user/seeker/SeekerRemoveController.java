package com.example.app.controller.user.seeker;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.controller.SubController;
import com.example.app.domain.seeker.dto.SeekerDto;
import com.example.app.domain.seeker.service.SeekerServiceImpl;

public class SeekerRemoveController implements SubController {
	
	private SeekerServiceImpl seekerServiceImpl;
	
	public SeekerRemoveController() {
		System.out.println("SeekerJoinController Constructor invoke");

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
				request.getRequestDispatcher("/WEB-INF/view/seeker/....jsp").forward(request, response);
				return ;
			}
			
			//01
			String id = request.getParameter("Id");
			String password = request.getParameter("Password");
			
			//02
			 if(!isValid(id,password)) {		
					return ;
			 }
		    //03
		    SeekerDto scckerDto = new SeekerDto();
		    scckerDto.setId(id);
		    scckerDto.setPassword(password);
		    Map<String, Object> isAdded = seekerServiceImpl.remove(scckerDto);
			//04
		    if(isAdded != null) {
				
				response.sendRedirect(request.getContextPath()+ "index");
				
			}else {
				
				request.getRequestDispatcher("").forward(request, response);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}



	private boolean isValid(String id, String password) {
		return true;

		
	}
}
