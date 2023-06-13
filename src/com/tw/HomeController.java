package com.tw;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="/play" ,method=RequestMethod.POST)
	public String play() {
		return "play";
	}
	
	@RequestMapping(value="/hello" ,method=RequestMethod.POST)
	public String sayHello(HttpServletRequest request, Model model ) {
		String name= request.getParameter("empName");
		String age=request.getParameter("age");
		
		model.addAttribute("name", name);
		model.addAttribute("empAge",age);
		return "hello";
	}
	
	@RequestMapping(value="/cources" ,method=RequestMethod.POST)
	public ModelAndView couces(HttpServletRequest request ) {
		String name= request.getParameter("empName");
		String age=request.getParameter("age");
		Date date=new Date();
		List<String> cources=getCources();

		ModelAndView model=new ModelAndView();
		model.addObject("name",name);
		model.addObject("age",age);
		model.addObject("date",date);
		model.addObject("cources",cources);
		
		return model;
	}

	public List<String> getCources(){
		List<String> cources=new ArrayList<>();
		cources.add("core java");
		cources.add("sql");
		cources.add("GIT HUB");
		cources.add("Spring core");
		cources.add("Spring MVC");
		cources.add("Spring Boot");
		cources.add("Maven");
		
		return cources;
	}
}
