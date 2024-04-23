package com.example.app.controller.book;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.controller.SubController;
import com.example.app.domain.dao.common.ConnectionPool;
import com.example.app.domain.dto.BookDto;
import com.example.app.domain.dto.Criteria;
import com.example.app.domain.service.BookService;
import com.example.app.domain.service.BookServiceImpl;

public class BookListController  implements SubController{
	
	private BookService bookService;
	private ConnectionPool connectionPool;
	
	public BookListController(){
		
		try {
			
			bookService = BookServiceImpl.getInstance();
			connectionPool = ConnectionPool.getInstance();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BookListController's execute() invoke");	
		
		try {
			
			String method = request.getMethod();
			// (p) 파라미터 받기
			String type = request.getParameter("type");
			String keyword = request.getParameter("pkeyword");
			String pageNo = request.getParameter("pageNo");
			// 1
			// 1000 건 -> 한페이지에 10건 -> 100페이지
			// pageNO : 1
			// Amount : 10건
			
			// (p) criteria null 설정
			Criteria criteria = null;
			// (p) 널값인지 확인
			if(pageNo==null) {
				
				criteria = new Criteria();//pageno = 1 amout=10
				
			} else {
					//pageno = 1 amout=10
				// (p) 널값이거나 비었는지 확인
				if(type==null || keyword==null || type.isEmpty() || keyword.isEmpty()) {
					criteria = new Criteria(Integer.parseInt(pageNo),10);
				} else {
					criteria = new Criteria(Integer.parseInt(pageNo),10,type,keyword);
				}
			}
			
			// 2
			
			// 3
			// (p) Map 에  returnValue 대입
			Map<String,Object> returnValue = bookService.getAllBooks(criteria);
			// 4 (p) returnValue 에 값 대입
			request.setAttribute("list", returnValue.get("list"));
			request.setAttribute("pageDto", returnValue.get("pageDto"));
			request.setAttribute("count", returnValue.get("count"));
			request.getRequestDispatcher("/WEB-INF/view/book/list.jsp").forward(request, response);
			
		}catch(Exception e) {
			e.printStackTrace();
			//예외페이지로 넘기기..or new ServletException("message")
		}
		}
	}
	



