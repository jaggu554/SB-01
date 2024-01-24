package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {

	@GetMapping("/")
	public String getGreet(Model model) {
		model.addAttribute("msg",  "Welcome to the thymeLeaf");
		return "index";
	}
	
	
}
