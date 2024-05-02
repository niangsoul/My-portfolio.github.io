package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value="/simple")
@Slf4j
public class SimpleController {
	// (p) get 방식 호출
	@RequestMapping(value="/t1",method=RequestMethod.GET)
	public void t1(Model model) {
		model.addAttribute("key1","value1");
		log.info("GET /simple/t1");
	}
	// (p) POST 방식 호출
	@RequestMapping(value="/t1",method=RequestMethod.POST)
	public void t1_post() {
		log.info("POST /simple/t1");
	}
	// (p) get,POST 방식 호출
	@RequestMapping(value="/t2",method= {RequestMethod.GET,RequestMethod.POST})
	public void t2() {
		log.info("GET /simple/t2");
	}
}
