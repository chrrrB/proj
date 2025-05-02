package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvailController {
	
	@RequestMapping("/")
	public String index() {
		return "Yes I am available";
	}

}
