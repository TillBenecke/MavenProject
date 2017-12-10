package de.project.planning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String index(ModelMap model) {

		model.addAttribute("message", "Hello Spring WEB MVC!");

		return "hello";
	}


	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test(ModelMap model) {

		return "test";
	}

	
}
