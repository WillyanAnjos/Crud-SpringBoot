package br.com.willyan.regescweb.controllers;

import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

	//Formas de receber
	/*
	@GetMapping("/hello")
	public String hello(HttpServletRequest request) {
		request.setAttribute("nome","Willyan");
		 return "hello";
	}
	 */
	@GetMapping("/hello")
	public String hello(Model model){
		model.addAttribute("nome","Willyan Souza Moreira dos Anjos");
		return "hello";
	}
}
