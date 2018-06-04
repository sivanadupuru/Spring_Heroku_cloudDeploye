package com.siva.lowes.form.validations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHerokuDemoApplication {
	@GetMapping("/sayHello")
	public String sayHello() {
		return "saying hello to heroku";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringHerokuDemoApplication.class, args);
	}
}
