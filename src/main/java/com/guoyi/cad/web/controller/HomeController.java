package com.guoyi.cad.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
//	@Autowired
//	public DepartmentServiceImp;
	
	@RequestMapping(value="/home.htm")
	public ModelAndView home(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView model = new ModelAndView("home");
		model.addObject("name", "Hello World!");
		return model;
	}

}
