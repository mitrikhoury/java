package com.axsos.FruityLoops.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

	
	  @RequestMapping("/")
	    public String index(Model model) {
	        
	        ArrayList<Item> fruits1 = new ArrayList<Item>();
	        fruits1.add(new Item("Kiwi", 1.5));
	        fruits1.add(new Item("Mango", 2.0));
	        fruits1.add(new Item("Goji Berries", 4.0));
	        fruits1.add(new Item("Guava", .75));
	        
	        model.addAttribute("fruits" , fruits1);
	        
	        
	        return "index";
	    }
}
