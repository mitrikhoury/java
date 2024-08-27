package com.axsos.DojoAndNinjas.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.DojoAndNinjas.Services.DojoService;
import com.axsos.DojoAndNinjas.models.Dojo;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/dojo")
public class ControllerrDojo {

	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/new")
    public String newDojo(@ModelAttribute("dojo")Dojo dojo , Model model ) {
//        model.addAttribute("dojo", new Dojo());
        return "NewDojo";
    }

    @PostMapping("/new")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo) {
      Dojo  DojoObj=dojoService.createDojo(dojo);
      System.out.println(DojoObj.getId());
        return "redirect:/dojo/" + DojoObj.getId();
    }
    @GetMapping("/{id}")
    public String showDojo(@PathVariable Long id, Model model) {
        Dojo dojo1 = dojoService.findDojo(id);
        System.out.println(dojo1.getName());
        model.addAttribute("dojo", dojo1);
        return "ShowDojo";
    }
}
