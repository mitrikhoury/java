package com.axsos.DisplayDate.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	  @GetMapping("/")
	    public String home() {
	        return "home";
	    }

	    @GetMapping("/date")
	    public String date(Model model) {
	        Date now = new Date();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, yyyy");
	        model.addAttribute("currentDate", dateFormat.format(now));
	        return "date";
	    }

	    @GetMapping("/time")
	    public String time(Model model) {
	        Date now = new Date();
	        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
	        model.addAttribute("currentTime", timeFormat.format(now));
	        return "time";
	    }

}
