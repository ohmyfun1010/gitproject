package com.info.production.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JNG0010Controller {
	
	@GetMapping("/JNF0010/0001")
	public String main() {
		return "0001";
	}
	
}
