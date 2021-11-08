package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.Date;

import org.apache.naming.java.javaURLContextFactory;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {

	@GetMapping("/hello")
	public String sayHello(Model model) {
		
		model.addAttribute("theDate", new Date());

		return "helloWorld";
	}
}
