package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greeting {
	
	@RequestMapping("/greeting")
	public @ResponseBody String greeting(){
		return "hello";
	}
	
	@RequestMapping("/test")
	public @ResponseBody String test(){
		return "test";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homepage(){
		return "templates/home";
	}
}
