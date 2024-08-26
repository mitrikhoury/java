package com.axsos.Languages.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.axsos.Languages.models.Languages;

public interface LanguagesRepository extends CrudRepository<Languages,Long>{

	List<Languages> findAll();
	Optional<Languages> findById(Long id);
}
