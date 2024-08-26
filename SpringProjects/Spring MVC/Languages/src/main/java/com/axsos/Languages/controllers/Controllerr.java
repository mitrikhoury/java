package com.axsos.Languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.Languages.models.Languages;
import com.axsos.Languages.services.LanguagesService;

import jakarta.validation.Valid;

@Controller
public class Controllerr {

	
	@Autowired
	LanguagesService languageService;
	
	@GetMapping("/Languages")
	public String Alllanguages(Model model, @ModelAttribute("language") Languages language) {
		List<Languages> languages = languageService.allLanguages();
		model.addAttribute("languages" , languages);

		return "mainPage.jsp";
	}
	
	@PostMapping("/add")
	public String add(@Valid @ModelAttribute("language") Languages language, BindingResult result) {
		if (result.hasErrors()) {
			return "mainPage.jsp";
		} else {
			languageService.createLanguage(language);
			return "redirect:/Languages";
		}
	}
	
	@GetMapping("/Languages/{languageId}")
	public String index(@PathVariable("languageId") Long languageId, Model model) {
		Languages language = languageService.findLanguage(languageId);
		model.addAttribute("language", language);
		return "show.jsp";
	}
	
	@GetMapping("/Languages/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Languages language = languageService.findLanguage(id);
		model.addAttribute("languageEdit", language);
		return "edit.jsp";
	}

	@PostMapping("/Languages/{id}")
	public String update(@Valid @ModelAttribute("languageEdit") Languages language, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("languageEdit", language);
			return "edit.jsp";
		} else {
		    languageService.update(language);
			return "redirect:/Languages";
		}
	}
	
	@PostMapping("/Languages/delete-item/{id}")
	public String destroy(@PathVariable("id") Long id) {
		languageService.deletelanguage(id);
		return "redirect:/Languages";
	}
	
}
