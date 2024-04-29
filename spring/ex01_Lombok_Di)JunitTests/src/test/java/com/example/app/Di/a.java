package com.example.app.Di;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.app.domain.dto.PersonDto;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class a {
	// (p) 퍼슨()호출
	@Autowired
	private PersonDto personDtoByXml;
	@Autowired
	private PersonDto personDtoByXml2;
	@Autowired
	private PersonDto person03;
	@Autowired
	private PersonDto personBean;
//	
	
	@Test
	public void beantests() {
		// (p) 출력
		log.info(personDtoByXml.toString());
		log.info(personDtoByXml2.toString());
		log.info(person03.toString());
		log.info(personBean.toString());
	}

}
