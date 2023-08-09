package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String aboutPage() {
		return "about";
	}
	
	@RequestMapping("/contact")
	public String contactPage() {
		return "contact";
	}
}
