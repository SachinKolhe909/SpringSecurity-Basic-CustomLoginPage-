package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	private String gotoIndexPage(ModelMap model) {
		model.addAttribute("msg", "Hello Spring");
		return "hello";

	}

}
