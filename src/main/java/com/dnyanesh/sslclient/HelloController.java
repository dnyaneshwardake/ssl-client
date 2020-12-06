package com.dnyanesh.sslclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping
	public String sayHello() {
		return restTemplate.getForObject("https://localhost:1111/server", String.class);
	}

}
