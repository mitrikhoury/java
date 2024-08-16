package com.axsos.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiPathVariablesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaikichiPathVariablesApplication.class, args);
    }

    @RequestMapping("")
    public String index() {
        return "Welcome!";
    }

    @RequestMapping("/today")
    public String today() {
        return "Today you will find luck in all your endeavors!";
    }

    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }

    @RequestMapping("/travel/{city}")
    public String city(@PathVariable String city) {
        return "Congratulations! You will soon travel to " + city + "!";
    }
    
    
    @RequestMapping("/lotto/{number}")
    public String number(@PathVariable String number) {
    	
       if(Integer.parseInt(number) % 2 == 0) { // even number 
    	   return "You will take a grand journey in the near future, but be weary of tempting offers";
       } else {// odd number 
    	   return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
       }
       
    }
}
