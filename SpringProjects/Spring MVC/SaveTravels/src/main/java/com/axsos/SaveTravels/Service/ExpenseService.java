package com.axsos.SaveTravels.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.SaveTravels.models.Expense;
import com.axsos.SaveTravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	
	private final ExpenseRepository expenseRepository;

	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	public List<Expense> allExpense(){
		return expenseRepository.findAll();
	}
	
	public Expense createExpense(Expense b) {
		return expenseRepository.save(b);
	}
	
	public Expense findExpense(Long id) {
		Optional<Expense> opExpense = expenseRepository.findById(id); // optional mean if it excites or not
		if (opExpense.isPresent()) {
			return opExpense.get();
		} else {
			return null;
		}
	}
	
	public Expense updateExpense(Expense b) {
		return expenseRepository.save(b);
	}
	
	public void deleteExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
			expenseRepository.deleteById(id);
		}
	}
}
