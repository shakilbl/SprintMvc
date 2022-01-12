package com.macrocom.controller;

import com.macrocom.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	public void feature1() {
		System.out.println("This is feature1");
	}
}
