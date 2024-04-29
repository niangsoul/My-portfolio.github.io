package com.example.app.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Getter
@Setter
@ToString*/
// (p) 주로 사용하는 라이브러리 생성
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDto {
	// (p) Dto 설정
	private String name;
	private int age;
	private String addr;
}
