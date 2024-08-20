package com.axsos.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class DaikichiPathVariables1Application {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariables1Application.class, args);
	}
	
//	@RequestMapping("")
//	public String hi() {return "hello";}
//	
//	@RequestMapping("/")
//	public String index(Model model) {
//		model.addAttribute("fruit","banana");
//		return "index.jsp";
//		}

	   @RequestMapping("/")
	    public String index(Model model) {
	        model.addAttribute("dojoName", "Burbank");
	        return "index";
	    }
	
}
