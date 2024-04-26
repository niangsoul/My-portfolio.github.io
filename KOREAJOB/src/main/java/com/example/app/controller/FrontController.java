package com.example.app.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.controller.user.UserJoinController;
import com.example.app.controller.user.UserLoginController;
import com.example.app.controller.user.UserLogoutController;
import com.example.app.controller.user.offer.OfferCompanyReadController;
import com.example.app.controller.user.offer.OfferJoinController;
import com.example.app.controller.user.offer.OfferRemoveController;
import com.example.app.controller.user.seeker.SeekerJoinController;
import com.example.app.controller.user.seeker.SeekerRemoveController;
import com.example.app.controller.user.seeker.SeekerResumeAddController;
import com.example.app.controller.user.seeker.SeekerResumeListController;




public class FrontController extends HttpServlet{
	
	private Map<String,SubController> map;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("FrontController's init() invoke..");
		
		
		map = new HashMap();
		
		String path = config.getServletContext().getContextPath();
		// '/'
		map.put(path+"/", new HomeController());
		
		//User공통(이동환)
		map.put(path+"/user/join", new UserJoinController());	//일반회원 | 기업회원 구분
		map.put(path+"/user/login", new UserLoginController());
		map.put(path+"/user/logout", new UserLogoutController());
		
		//Seeker(박정현)
		map.put(path+"/seeker/join", 	new SeekerJoinController());					//회원가입
		map.put(path+"/seeker/remove", 	new SeekerRemoveController());					//회원탈퇴		
		map.put(path+"/seeker/resume/add", 	new SeekerResumeAddController());			//이력서 추가
		map.put(path+"/seeker/resume/list", 	new SeekerResumeListController());		//이력서 리스트 보기

		
		//Offer(나재현)
		map.put(path+"/offer/join", 	new OfferJoinController());						//회원가입
		map.put(path+"/offer/remove", 	new OfferRemoveController());					//회원탈퇴
		map.put(path+"/offer/company/read", 	new OfferCompanyReadController());		//회사정보 보기
																						//구직자 정보 보기(무슨 어떤 결재가 필요하지 않을까?)
			
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//문자셋설정
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		
		String uri =  request.getRequestURI();
		System.out.println("FrontController's service() invoke.."+uri);
		
		SubController controller =  map.get(uri);
		if(controller==null) {
			throw new ServletException("해당 페이지는 존재하지 않습니다..");
		}
			
		controller.execute(request, response);
		
		
	}


	
	
}
