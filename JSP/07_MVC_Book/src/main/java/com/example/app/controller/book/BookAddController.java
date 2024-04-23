package com.example.app.controller.book;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.controller.SubController;
import com.example.app.domain.dao.common.ConnectionPool;
import com.example.app.domain.dto.BookDto;
import com.example.app.domain.service.BookService;
import com.example.app.domain.service.BookServiceImpl;

public class BookAddController implements SubController{

	private BookService bookService;
	private ConnectionPool connectionPool;
	
	public BookAddController(){
		
		try {
			
			bookService = BookServiceImpl.getInstance();
			connectionPool = ConnectionPool.getInstance();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BookAddController's execute() invoke ");
		
		try {
			
			//GET 요청
			String method = request.getMethod();
			if(method.contains("GET")) {
				request.getRequestDispatcher("/WEB-INF/view/book/add.jsp").forward(request, response);
				return ;
			}
			
			//POST 요청(etc Method)
			//1
			String bookCode = request.getParameter("bookCode");
			String bookName = request.getParameter("bookName");
			String publisher = request.getParameter("publisher");
			String isbn = request.getParameter("isbn");
			
			//2
			if(!isValid(bookCode,bookName,publisher,isbn)) {		
				
				return ;
			}
			
			//3
			BookDto bookDto = new BookDto( Integer.parseInt(bookCode),bookName,publisher,isbn);
			
			boolean isadded = 	bookService.bookRegister(bookDto);
				
			//4
			if(isadded) {
				
				response.sendRedirect(request.getContextPath()+ "/book/list");
				
			}else {
				
				request.getRequestDispatcher("/WEB-INF/view/book/add.jsp").forward(request, response);
				
			}
		
			
		}catch(Exception e) {
			e.printStackTrace();
			//예외페이지로 넘기기..or new ServletException("message") 처ㅣ
			
			try {
				connectionPool.txRollBack();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
		}
		
	}

	private boolean isValid(String bookCode, String bookName, String publisher, String isbn) {
		if(bookCode==null) {
			return false;
		}
		if(bookCode.isEmpty()) {
			return false;
		}
		if(bookName==null || bookName.isEmpty())
			return false;
		if(publisher==null || publisher.isEmpty())
			return false;
		if(isbn==null || isbn.isEmpty())
			return false;
		
		return true;
	}
	

}