package com.axsos.Languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.Languages.models.Languages;
import com.axsos.Languages.repositories.LanguagesRepository;

@Service
public class LanguagesService {

	private final LanguagesRepository languagesRepository;

	public LanguagesService(LanguagesRepository languagesRepository) {
		this.languagesRepository = languagesRepository;
	}
	
	public List<Languages> allLanguages(){
		return languagesRepository.findAll();
	}
	
	public Languages createLanguage(Languages l) {
		return languagesRepository.save(l);
	}
	
	public Languages findLanguage(Long id ) {
		Optional<Languages> oplanguages = languagesRepository.findById(id); // optional mean if it excites or not
		if (oplanguages.isPresent()) {
			return oplanguages.get();
		} else {
			return null;
		}
	}
	
	public Languages update(Languages l) {
		return languagesRepository.save(l);
	}
	public void deletelanguage(Long id) {
		Optional<Languages> optionalLanguage = languagesRepository.findById(id);
		if (optionalLanguage.isPresent()) {
			languagesRepository.deleteById(id);
		}
	}
}
