package com.ard.ps;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/hello")
	public String helloWorld(Model model){
		model.addAttribute("greeting", "Hello Word");
		return "hello";
	}
	
}
