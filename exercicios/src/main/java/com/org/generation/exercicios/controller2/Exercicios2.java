package com.org.generation.exercicios.controller2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicios2 {
	
	
	

		@RequestMapping ("/Objetivos")
		public String Exercicio2() {
			
			return "Persistir em melhoras e absorve materias novas !! ";
		
		}
}


