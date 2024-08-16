package com.axsos.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloHumanApplication.class, args);
    }

    @RequestMapping("/")
    public String helloName(
            @RequestParam(value = "name", defaultValue = "human") String name,
            @RequestParam(value = "last_name", defaultValue = "") String lastName,
            @RequestParam(value = "time", defaultValue = "1") String time) {
        
        StringBuilder greeting = new StringBuilder();
        String fullName = name + (lastName.isEmpty() ? "" : " " + lastName);
        
        int times = Integer.parseInt(time);
        for (int i = 0; i < times; i++) {
            greeting.append("Hello ").append(fullName).append("! ");
        }
        
        return greeting.toString();
    }
}
