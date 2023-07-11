package com.joct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/wel")
	public ModelAndView welcome() {
		ModelAndView mv=new ModelAndView("welcome");
		String st="Welcome to SpringMVC Tutorial";
		mv.addObject("mess",st);
		return mv;
		
	}
}