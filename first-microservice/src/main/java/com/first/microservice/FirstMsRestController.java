package com.first.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstMsRestController {
	
	@GetMapping("/firstMs")
	public String firstMs() {
		return "From first microservice";
	}
}
