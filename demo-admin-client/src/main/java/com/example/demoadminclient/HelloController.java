package com.example.demoadminclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

  
	@GetMapping
	public String hello() {
		log.info("METHOD hello() - RETURN 'HELLO'");
		return "Hello";
	}
}
