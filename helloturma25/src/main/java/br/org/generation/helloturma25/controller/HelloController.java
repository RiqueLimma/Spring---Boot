package br.org.generation.helloturma25.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

	
	@RequestMapping
	public String hello() {
		
		return "Hello Turma 25!";
		
	}
}
