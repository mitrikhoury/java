package com.axsos.authentication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.authentication.Models.LoginUser;
import com.axsos.authentication.Models.User;
import com.axsos.authentication.Service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {

	// Add once service is implemented:
	@Autowired
	private UserService userServ;

	@GetMapping("/")
	public String index(Model model) {

		// Bind empty User and LoginUser objects to the JSP
		// to capture the form input
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "home.jsp";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		User user = userServ.register(newUser, result);

		if (result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "home.jsp";
		}
		session.setAttribute("userId", user.getId());

		return "redirect:/welcome";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {

		User user = userServ.login(newLogin, result);

		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "home.jsp";
		}
		session.setAttribute("userId", user.getId());
		return "redirect:/welcome";
	}

	@GetMapping("/welcome")
	public String welcome(HttpSession session, Model model) {

		if (session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}

		Long userId = (Long) session.getAttribute("userId");
		model.addAttribute("user", userServ.findById(userId));

		return "welcome.jsp";

	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("userId", null);

		return "redirect:/";
	}
}
