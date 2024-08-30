package com.axsos.authentication.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.authentication.Models.Book;
import com.axsos.authentication.Models.User;
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

	 public Book updateBook(Book book) {
	        return bookRepositiory.save(book);
	    }

	    public void deleteBook(Book book) {
	    	bookRepositiory.delete(book);
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
	 public List<Book> unborrowedBooks(User user) {
	        return bookRepositiory.findByBorrowerIsNull();
	    }

	    public List<Book> borrowedBooks(User user) {
	        return bookRepositiory.findByBorrower(user);
	    }

	    public void addBorrower(Book book, User user) {
	        book.setBorrower(user);
	        bookRepositiory.save(book);
	    }

	    public void removeBorrower(Book book) {
	        book.setBorrower(null);
	        bookRepositiory.save(book);
	    }
}
