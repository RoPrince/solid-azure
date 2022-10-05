package com.azure.trailapp.trailapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class TrailAzureApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "Message received";
	}

	public static void main(String[] args) {
		SpringApplication.run(TrailAzureApplication.class, args);
	}

}
