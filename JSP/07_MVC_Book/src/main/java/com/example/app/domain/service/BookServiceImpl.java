package com.example.app.domain.service;

import java.sql.Connection;
import java.util.List;

import com.example.app.domain.dao.BookDao;
import com.example.app.domain.dao.BookDaoImpl;
import com.example.app.domain.dao.common.ConnectionPool;
import com.example.app.domain.dao.common.ConnectionPool_ByHikari;
import com.example.app.domain.dto.BookDto;

public class BookServiceImpl implements BookService {
	
	private BookDao dao;
	private ConnectionPool connectionPool; //05-01Day
	
	private static BookService instance ;
	public static BookService getInstance() throws Exception {
		if(instance==null)
			instance=new BookServiceImpl();
		return instance;
	}
	
	private BookServiceImpl() throws Exception{
		
		dao = BookDaoImpl.getInstance();
		this.connectionPool = ConnectionPool.getInstance();
	}
	
	@Override
	public boolean BookRegister(BookDto dto) throws Exception {
		
		//TX
		connectionPool.txStart();			//05-01 Day TX
		boolean result = dao.Insert(dto);	//05-01 Day TX
		connectionPool.txCommit();			//05-01 Day TX
		
		return result;
	};
	@Override
	public List<BookDto> getAllBooks() throws Exception {
		
		//TX
		connectionPool.txStart();				//05-01 Day TX
		List<BookDto> list = dao.SelectAll();	//05-01 Day TX
		connectionPool.txCommit();				//05-01 Day TX
		return list;
	}
	
	
	@Override
	public BookDto getBook(int bookCode) throws Exception{
		
		
		BookDto dto =  dao.Select(bookCode);
		
		return dto;
	}

	@Override
	public boolean bookRegister(com.example.app.domain.dto.BookDto dto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
