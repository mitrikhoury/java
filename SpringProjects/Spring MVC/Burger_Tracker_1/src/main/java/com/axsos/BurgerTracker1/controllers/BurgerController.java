package com.axsos.BurgerTracker1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.axsos.BurgerTracker1.models.Burger;
import com.axsos.BurgerTracker1.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {

	@Autowired
	BurgerService burgerService;

	@GetMapping("/")
	public String AllBurger(Model model, @ModelAttribute("burger") Burger burger) {
		List<Burger> burgers = burgerService.allBurger();
		model.addAttribute("burgers", burgers);

		return "mainPage.jsp";
	}

	@PostMapping("/add")
	public String add(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
		if (result.hasErrors()) {
			return "mainPage.jsp";
		} else {
			burgerService.creatBurger(burger);
			return "redirect:/";
		}
	}
	
	 @GetMapping("/burger/edit/{id}")
	    public String edit(@PathVariable("id") Long id, Model model) {
		 Burger burger = burgerService.findBurger(id);
	        model.addAttribute("burgerEdit", burger);
	        return "edit.jsp";
	    }
	    
	    @PostMapping("/burger/{id}")
	    public String update(@Valid @ModelAttribute("burgerEdit") Burger burger, BindingResult result,Model model) {
	        if (result.hasErrors()) {
	            model.addAttribute("burgerEdit", burger);
	            return "edit.jsp";
	        } else {
	            burgerService.updateBurger(burger);
	            return "redirect:/";
	        }
	    }
}
