package com.axsos.BurgerTracker1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
}
