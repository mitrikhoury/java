package com.axsos.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.mvc.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findAll(); // select all from book table statement 
	
	  // this method finds books with descriptions containing the search string
    List<Book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain stringcopy
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);


    
    // (save) method for update and create
} 
