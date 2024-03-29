package com.cgy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MyController {

	@Value("${name}")
	private String name;
	
	
	@GetMapping("/")
	public String get() {
		return name;
	}
}
