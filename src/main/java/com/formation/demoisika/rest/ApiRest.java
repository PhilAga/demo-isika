package com.formation.demoisika.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.formation.demoisika.service.CalculatorService;

@RestController
public class ApiRest {
	
	@Autowired
	private CalculatorService service;
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World from Isika V2";
	}
	
	@RequestMapping("/sum")
	public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
		return service.add(a, b);
	}

}
