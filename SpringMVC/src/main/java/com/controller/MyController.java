package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String indexPage(Model m) {
		m.addAttribute("num", 123);
		List<String> list = new ArrayList<String>();
		list.add("c");
		list.add("c++");
		list.add("java");
		list.add("python");
		list.add("kotlin");
		m.addAttribute("list", list);
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
	
	@RequestMapping("/register")
	public void getRequest(@ModelAttribute User u) {
		System.out.println(u);
	}
	
//	@RequestMapping("/register")
//	public void getRequest(HttpServletRequest request) {
//		String name = request.getParameter("name");
//		String con = request.getParameter("contact");
//		System.out.println(name+" "+con);
//	}
}
