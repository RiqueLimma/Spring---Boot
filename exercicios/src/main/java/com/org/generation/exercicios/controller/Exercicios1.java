package com.org.generation.exercicios.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicios1 {

	@RequestMapping("/habilidade_mentalidade")
	public String Exercicio1() {
		return "A Habilidade é: Atenção aos detalhes \n\n" 
				+ "\n A mentalidade é: Persistência.";
	
	
	}
		
}