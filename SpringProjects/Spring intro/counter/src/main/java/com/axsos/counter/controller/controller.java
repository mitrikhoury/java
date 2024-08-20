package com.axsos.counter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class controller {

	@GetMapping("/your_server")
	public String home(HttpSession session) {
		
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			}
			else {// increment the count by 1 using getAttribute and setAttribute
			Integer counter = (Integer) session.getAttribute("count");
			session.setAttribute("count", counter + 1);
			}	
		return "your_server";
	}
	
	@GetMapping("/your_server/counter")
	public String counter(Model model , HttpSession session) {
		if(session.getAttribute("count") != null) {
			model.addAttribute("number" , session.getAttribute("count"));
		}
		return "counter";
	}
	
	@GetMapping("/incrementByTwo")
	    public String incrementByTwo(HttpSession session) {
	        Integer counter = (Integer) session.getAttribute("count");
	        if (counter == null) {
	            counter = 0;
	        }
	        session.setAttribute("count", counter + 2);
	        return "your_server";
	    }

	@GetMapping("/reset")
	    public String reset(HttpSession session) {
	        session.setAttribute("count", 0);
	        return "your_server";
	    }
	
}
