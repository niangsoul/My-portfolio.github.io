package com.example.app.domain.service;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.app.domain.dao.BookDao;
import com.example.app.domain.dao.BookDaoImpl;
import com.example.app.domain.dao.common.ConnectionPool;
import com.example.app.domain.dao.common.ConnectionPool_ByHikari;
import com.example.app.domain.dto.BookDto;
import com.example.app.domain.dto.Criteria;
import com.example.app.domain.dto.PageDto;

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
	public Map<String,Object> getAllBooks(Criteria criteria) throws Exception {
		//TX
		connectionPool.txStart();				//05-01 Day TX
		
		Map<String,Object> resultValue = new HashMap();
		
		if(criteria.getType()==null || criteria.getKeyword() == null) {
			// (p) 토탈 카운트 받기
			int count = dao.Count();
			// (p) 토탈 카운트 출력
			System.out.println("total Count : " + count);
			// (p) 모든 정보 받기
			PageDto pageDto = new PageDto(count,criteria);
			// (p) 모든 정보 출력
			System.out.println("pageDto :" + pageDto);
			
			int offset = (criteria.getPageno()-1)*criteria.getAmount();
			List<BookDto> list =  dao.selectAll(offset,criteria.getAmount());
			System.out.println("list" + list);
			// (p) resultValue 에 값 대입
			resultValue.put("pageDto", pageDto);	// 페이징처리에 필요한 요소들
			resultValue.put("list", list);		// 해당 페이지에 표시할 게시물들
			resultValue.put("count", count);	// 전체 게시물 건수
		} else {
			int count = dao.Count(criteria);
			// (p) 토탈 카운트 출력
			System.out.println("total Count : " + count);
			// (p) 모든 정보 받기
			PageDto pageDto = new PageDto(count,criteria);
			// (p) 모든 정보 출력
			System.out.println("pageDto :" + pageDto);
			
			int offset = (criteria.getPageno()-1)*criteria.getAmount();
			List<BookDto> list =  dao.selectAll(offset,criteria.getAmount(),criteria);
			System.out.println("list" + list);
			// (p) resultValue 에 값 대입
			resultValue.put("pageDto", pageDto);	// 페이징처리에 필요한 요소들
			resultValue.put("list", list);		// 해당 페이지에 표시할 게시물들
			resultValue.put("count", count);	// 전체 게시물 건수
		}
		

	
		
		connectionPool.txCommit();				//05-01 Day TX
		return resultValue;
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
