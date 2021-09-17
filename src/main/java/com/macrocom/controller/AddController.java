package com.macrocom.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.macrocom.service.AddService;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
		
		AddService as = new AddService();
		int sum = as.add(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", sum);
		
		return mv;
				
	} 
	
	@RequestMapping("/add-http-servlet-version")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int num1 = Integer.parseInt(request.getParameter("t1"));
		int num2 = Integer.parseInt(request.getParameter("t2"));
		
		int sum = num1 + num2;
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("display.jsp");
		mv.addObject("result", sum);
		
		return mv;
	}
}
