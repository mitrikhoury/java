package com.axsos.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiPathVariables1Application {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariables1Application.class, args);
	}
	
	@RequestMapping("")
	public String hi() {return "hello";}

}
