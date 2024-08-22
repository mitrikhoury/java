package com.axsos.BurgerTracker1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.BurgerTracker1.models.Burger;
import com.axsos.BurgerTracker1.repositories.BurgerRepository;

@Service
public class BurgerService {

	private final BurgerRepository burgerRepository;

	public BurgerService(BurgerRepository burgerRepository) {
		this.burgerRepository = burgerRepository;
	}

	public List<Burger> allBurger() { // return all burger from table
		return burgerRepository.findAll();
	}

	public Burger creatBurger(Burger b) { // create burger
		return burgerRepository.save(b);
	}

	public Burger findBurger(Long id) {
		Optional<Burger> opBurger = burgerRepository.findById(id); // optional mean if it excites or not
		if (opBurger.isPresent()) {
			return opBurger.get();
		} else {
			return null;
		}
	}

	public Burger updateBurger(Burger b) {
		return burgerRepository.save(b);
	}

	public void deleteBurger(Long id) {
		Optional<Burger> optionalBurger = burgerRepository.findById(id);
		if (optionalBurger.isPresent()) {
			burgerRepository.deleteById(id);
		}
	}

}
