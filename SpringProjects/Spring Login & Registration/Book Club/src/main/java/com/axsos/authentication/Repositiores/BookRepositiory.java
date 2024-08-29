package com.axsos.authentication.Repositiores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.authentication.Models.Book;

@Repository
public interface BookRepositiory extends CrudRepository<Book, Long> {

	List<Book> findAll();
}
