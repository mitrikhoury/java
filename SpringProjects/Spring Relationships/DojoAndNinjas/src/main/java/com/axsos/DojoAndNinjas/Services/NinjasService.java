package com.axsos.DojoAndNinjas.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.DojoAndNinjas.Repositiores.NinjaRepositiors;
import com.axsos.DojoAndNinjas.models.Ninja;

@Service
public class NinjasService {

	private final NinjaRepositiors ninjaRepositiory;

	public NinjasService(NinjaRepositiors ninjaRepositiory) {
		this.ninjaRepositiory = ninjaRepositiory;
	}
	
	public List<Ninja> allNinjas(){
		return ninjaRepositiory.findAll();
	}
	
	public Ninja createNinja(Ninja n) {
		return ninjaRepositiory.save(n);
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> opNinja = ninjaRepositiory.findById(id);
		if(opNinja.isPresent()) {
			return opNinja.get();
		}
	    return null;
	}
}
