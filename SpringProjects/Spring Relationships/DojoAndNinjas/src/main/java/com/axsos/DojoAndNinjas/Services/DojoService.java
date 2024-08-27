package com.axsos.DojoAndNinjas.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.DojoAndNinjas.Repositiores.DojoRepositiore;
import com.axsos.DojoAndNinjas.models.Dojo;

@Service
public class DojoService {

	private final DojoRepositiore dojoRepositiory;

	public DojoService(DojoRepositiore dojoRepositiory) {
		this.dojoRepositiory = dojoRepositiory;
	}
	
	public List<Dojo> allDojos(){
		return dojoRepositiory.findAll();
	}
	
	public Dojo createDojo(Dojo d) {
		return dojoRepositiory.save(d);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> opDojo = dojoRepositiory.findById(id);
		if(opDojo.isPresent()) {
			return opDojo.get();
		}
		return null;
	}
}
