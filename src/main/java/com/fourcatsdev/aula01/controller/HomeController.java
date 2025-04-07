package com.fourcatsdev.aula01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@RequestMapping("/")
	public String Index(Model model) {
		model.addAttribute("msnBemVindo", "Bem Vindo a biblioteca");
		return "publica-index";
	}
}
