package com.axsos.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.mvc.models.Book;
import com.axsos.mvc.repositories.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}
	
	// return all the books 
	public List<Book> allBooks(){
		return bookRepository.findAll();
	}
	
	// create a book
	public Book createBook(Book a) {
		return bookRepository.save(a);
	}
	
	// find book by id 
	public Book findBook(Long id ) {
		Optional<Book> optionalBook = bookRepository.findById(id); // optional mean if it excites or not 
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}else {
			return null;
		}
	}

	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}
	
    	public void deleteBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			bookRepository.deleteById(id);
		}
	}

	
	
}
