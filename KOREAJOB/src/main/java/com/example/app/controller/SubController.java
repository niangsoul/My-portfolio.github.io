package com.example.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SubController {
	void execute(HttpServletRequest request,HttpServletResponse response);
}
