package com.axsos.HoppersReceipt.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping(path ="")
	public String index(Model model) {
		model.addAttribute("customerName" , "Grace Hopper");
		model.addAttribute("itemName" , "Copper Wire");
		model.addAttribute("price" , "$5.25");
		model.addAttribute("description" , "Metal strips. Also an illustration of nanoseconds");
		model.addAttribute("vender" , "Little Things Corner Store");
		return "HoppersReceipt";
	}
}
