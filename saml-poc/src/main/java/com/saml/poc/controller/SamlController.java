package com.saml.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SamlController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

}
