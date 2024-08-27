package com.axsos.DojoAndNinjas.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.DojoAndNinjas.Services.DojoService;
import com.axsos.DojoAndNinjas.Services.NinjasService;
import com.axsos.DojoAndNinjas.models.Ninja;

@Controller
@RequestMapping("/ninjas")
public class ControllerNinja {
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjasService ninjaService;
	
	  @GetMapping("/new")
	    public String newNinja(Model model) {
	        model.addAttribute("ninja", new Ninja());
	        model.addAttribute("dojos", dojoService.allDojos());
	        return "NewNinja";
	    }

	    @PostMapping("/new")
	    public String createNinja(@ModelAttribute Ninja ninja) {
	        ninjaService.createNinja(ninja);
	        return "redirect:/dojo/" + ninja.getDojo().getId();
	    }
	
}
