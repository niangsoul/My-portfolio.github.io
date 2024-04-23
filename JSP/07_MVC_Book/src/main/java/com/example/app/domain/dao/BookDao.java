package com.example.app.domain.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.app.domain.dto.BookDto;
import com.example.app.domain.dto.Criteria;

// (p) book 메서드 정의

public interface BookDao {

	//INSERT
	boolean Insert(BookDto dto) throws Exception;

	//SELECTALL
	List<BookDto> SelectAll() throws Exception;

	//SELECTONE
	BookDto Select(int bookCode) throws Exception;
	// (p) SELECTALL 완성본
	int Count() throws Exception;
	List<BookDto> selectAll(int offset, int amount) throws SQLException;

	int Count(Criteria criteria) throws Exception;

	List<BookDto> selectAll(int offset, int amount, Criteria criteria) throws Exception;



}