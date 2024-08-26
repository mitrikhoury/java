package com.axsos.SaveTravels.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.axsos.SaveTravels.Service.ExpenseService;
import com.axsos.SaveTravels.models.Expense;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {
	@Autowired
	private final ExpenseService expenseService;

	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}

	@GetMapping("/expenses")
	public String allExpense(Model model, @ModelAttribute("expense") Expense expense) {
		List<Expense> expenseList = expenseService.allExpense();
		model.addAttribute("expenses", expenseList);

		return "Main.jsp";
	}

	@PostMapping("/add")
	public String add(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if (result.hasErrors()) {
			return "Main.jsp";
		} else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}

	@GetMapping("/expenses/{expenseId}")
	public String index(@PathVariable("expenseId") Long expenseId, Model model) {
		Expense expense = expenseService.findExpense(expenseId);
		model.addAttribute("expense", expense);
		return "show.jsp";
	}

	@GetMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("ExpenseEdit", expense);
		return "edit.jsp";
	}

	@PostMapping("/expensess/{id}")
	public String update(@Valid @ModelAttribute("ExpenseEdit") Expense expense, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("ExpenseEdit", expense);
			return "edit.jsp";
		} else {
			expenseService.updateExpense(expense);
			return "redirect:/expenses";
		}
	}

	@PostMapping("/expensess/delete-item/{id}")
	public String destroy(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/expenses";
	}
}
