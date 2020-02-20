package com.second.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondMsRestController {
	
	@GetMapping("/secondMs")
	public String secondMs() {
		return "From second microservice";
	}
	
}
