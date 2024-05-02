package com.example.app.controller;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@WebAppConfiguration
@Slf4j
public class controllerTests {

	@Autowired
	private SimpleController simpleController;

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void isNotnullTests() {
		log.info(simpleController.toString());
		log.info(mockMvc.toString());
		assertNotNull(simpleController);
		assertNotNull(mockMvc);
	}

	@Test
	public void simpleControllerTests() throws Exception {
		// Get /simple/t1
		/*
		 * mockMvc.perform(get("/simple/t1")).andExpect(status().isOk()).andExpect(view(
		 * ).name("simple/t1"))
		 * .andExpect(model().attributeExists("key1")).andDo(print());
		 */

		// POST /simple/t1
		mockMvc.perform(post("/simple/t1")).andExpect(status().isOk()).andDo(print());
		// GET/POST /simple/t1
		mockMvc.perform(get("/simple/t2")).andExpect(status().isOk()).andDo(print());
		mockMvc.perform(post("/simple/t2")).andExpect(status().isOk()).andDo(print());
	}
	
	
	@Autowired
	private ParmeterTestController parmeterTestController;
	
	@Test
	// (p) 출력
	public void paramTests() throws Exception{
		mockMvc.perform(post("/test/p03").param("username", "점심뭐먹지..")).andExpect(status().isOk()).andDo(print());
	}

}
