package com.axsos.SaveTravels.repositories;

import java.util.List;
import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.SaveTravels.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {

	List<Expense> findAll();
	
	Optional<Expense> findById(Long id);
	
}
