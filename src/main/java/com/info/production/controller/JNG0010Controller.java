package com.info.production.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JNG0010Controller {
	
	@GetMapping("/JNF0010/0001")
	public String main() {
		return "0001";
	}
	
	@GetMapping("/JNF0010/0003")
	public String commit() {
		return "commit";
	}
	
	@GetMapping("/JNF0010/0004")
	public String reset() {
		return "reset";
	}
	
}
