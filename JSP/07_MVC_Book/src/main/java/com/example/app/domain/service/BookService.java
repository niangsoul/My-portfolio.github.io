package com.example.app.domain.service;

import java.util.List;

import com.example.app.domain.dto.BookDto;

// (p) book 관련 서비스 정의
public interface BookService {

	boolean bookRegister(BookDto dto) throws Exception;

	List<BookDto> getAllBooks() throws Exception;

	BookDto getBook(int bookCode) throws Exception;

	boolean BookRegister(BookDto dto) throws Exception;

}