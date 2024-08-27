package com.axsos.DojoAndNinjas.Repositiores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.DojoAndNinjas.models.Dojo;

@Repository
public interface DojoRepositiore extends CrudRepository<Dojo, Long> {

	List<Dojo> findAll();
}
