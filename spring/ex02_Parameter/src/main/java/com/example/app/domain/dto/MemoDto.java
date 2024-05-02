package com.example.app.domain.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Builder
public class MemoDto {
	private int id;
	private String text;
	private String writer;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )	// 이거해야 매핑됨...
	private LocalDateTime regdate; 						// yyyy-MM-dd HH:mm:ss
}