package com.example.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.app.domain.dto.PersonDto;

@Configuration
public class PersonDtoBeanConfig {
	
	@Bean
	public PersonDto person03() {
		return PersonDto.builder()
				// (p) 이름대입
				.name("김범수")
				// (p) 주소대입
				.addr("서울")
				// (p) 나이대입
				.age(49)
				.build();
	}
	// (p) person04 이름 설정
	@Bean (name="personBean")
	public PersonDto person04() {
		return PersonDto.builder()
				.name("박효신")
				.addr("대구")
				.age(15)
				.build();
	}
}
