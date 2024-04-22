package com.example.app.domain.dao;

import java.util.List;

import com.example.app.domain.dto.BookDto;

// (p) book 메서드 정의

public interface BookDao {

	//INSERT
	boolean Insert(BookDto dto) throws Exception;

	//SELECTALL
	List<BookDto> SelectAll() throws Exception;

	//SELECTONE
	BookDto Select(int bookCode) throws Exception;

}