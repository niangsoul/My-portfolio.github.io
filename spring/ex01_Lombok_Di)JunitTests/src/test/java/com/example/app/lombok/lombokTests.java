package com.example.app.lombok;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.example.app.domain.dto.PersonDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class lombokTests {

	@Test
	public void PersonDtoTests() {
		PersonDto ob = new PersonDto();
		// (p) 값 대입
		ob.setName("홍길동");
		ob.setAddr("대구");
		ob.setAge(55);
		log.info(ob.toString());
		// Junit Test function..
		
		assertNotNull(ob);
		
	}
	
	@Test
	public void personDtoTest2() {
		// @Builder
		PersonDto ob = PersonDto.builder()
				// (p) 값 대입
				.age(11)
				.name("홍길동")
				.addr("울산")
				.build();
		log.info(ob.toString());
		
		assertNotNull(ob);
		
	}

}
