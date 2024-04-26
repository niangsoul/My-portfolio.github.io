package com.example.app.controller.user.offer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.controller.SubController;
import com.example.app.domain.offer.service.OfferServiceImpl;

public class OfferJoinController implements SubController {

	private OfferServiceImpl offerServiceImpl;
	
	public OfferJoinController() {
		System.out.println("OfferJoinController Constructor invoke");

		try {
			offerServiceImpl = OfferServiceImpl.getInstance();
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
				request.getRequestDispatcher("/WEB-INF/view/offer/join.jsp").forward(request, response);
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
