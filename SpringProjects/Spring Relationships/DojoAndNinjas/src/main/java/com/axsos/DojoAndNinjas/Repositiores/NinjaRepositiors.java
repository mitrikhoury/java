package com.axsos.DojoAndNinjas.Repositiores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.DojoAndNinjas.models.Ninja;

@Repository
public interface NinjaRepositiors extends CrudRepository<Ninja, Long> {

	List<Ninja> findAll();
}
