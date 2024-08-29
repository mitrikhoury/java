package com.axsos.authentication.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.authentication.Models.Book;
import com.axsos.authentication.Repositiores.BookRepositiory;

@Service
public class BookService {

	private BookRepositiory bookRepositiory;

	public BookService(BookRepositiory bookRepositiory) {
		this.bookRepositiory = bookRepositiory;
	}

	public List<Book> allBok() {
		return bookRepositiory.findAll();
	}

	public Book createBook(Book b) {
		return bookRepositiory.save(b);
	}

	public Book findById(Long id) {
		Optional<Book> opBook = bookRepositiory.findById(id);
		if (opBook.isPresent()) {
			return opBook.get();
		}
		return null;
	}
	public void deleteById(Long id) {
		bookRepositiory.deleteById(id);
	}

}
