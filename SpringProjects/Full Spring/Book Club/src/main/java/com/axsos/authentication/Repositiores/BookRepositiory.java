package com.axsos.authentication.Repositiores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.authentication.Models.Book;
import com.axsos.authentication.Models.User;

@Repository
public interface BookRepositiory extends CrudRepository<Book, Long> {

	List<Book> findAll();
	List<Book> findByBorrowerIsNull();
    List<Book> findByBorrower(User user);
}
