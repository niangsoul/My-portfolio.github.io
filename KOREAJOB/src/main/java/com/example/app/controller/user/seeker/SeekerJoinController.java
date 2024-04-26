package com.example.app.controller.user.seeker;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.example.app.controller.SubController;
import com.example.app.domain.seeker.dto.SeekerDto;
import com.example.app.domain.seeker.service.SeekerServiceImpl;

public class SeekerJoinController implements SubController {

	private SeekerServiceImpl seekerServiceImpl;
	
	public SeekerJoinController() {
		System.out.println("SeekerRemoveController Constructor invoke");

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
				request.getRequestDispatcher("/WEB-INF/view/seeker/join.jsp").forward(request, response);
				return ;
			}
			
			//01 파라미터받기 
			String id = request.getParameter("Id");
		    String username = request.getParameter("Username");
		    String password = request.getParameter("Password");
		    String tel = request.getParameter("Tel");
		    String addr = request.getParameter("Address");
			//02 유효성검사
		    if(!isValid(id,username,password,tel,addr)) {		
				return ;
			} else {
			}
			
			//03 -!!!!!!!!!!!!!!
		    SeekerDto scckerDto = new SeekerDto();
		    scckerDto.setId(id);
		    scckerDto.setUsername(username);
		    scckerDto.setPassword(password);
		    scckerDto.setTel(tel);
		    scckerDto.setAddress(addr);
		    Map<String, Object> isAdded = seekerServiceImpl.join(scckerDto);
			//04
		    if(isAdded != null) {
				
				response.sendRedirect(request.getContextPath()+ "index");
				
			}else {
				
				request.getRequestDispatcher("/WEB-INF/view/seeker/resume/add.jsp").forward(request, response);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

	private boolean isValid(String id, String username, String password, String tel, String addr) {
		// 널 값인지 확인
		
		if(id==null || id == "" || username == null || username == "" || password == null || password == ""
				|| tel == null || tel == "" || addr == null || addr == ""	
				) {
			return false;
		}
		
		
		return true;
	}

}
