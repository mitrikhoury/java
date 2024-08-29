package com.axsos.authentication.Repositiores;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.authentication.Models.User;

@Repository
public interface UserRepositiory extends CrudRepository<User, Long>{

	List<User> findAll();
	Optional<User> findByEmail(String email);
	
}
