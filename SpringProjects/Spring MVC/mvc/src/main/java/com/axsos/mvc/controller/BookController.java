package com.axsos.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.mvc.models.Book;
import com.axsos.mvc.services.BookService;

import jakarta.validation.Valid;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/books/{bookId}")
	public String index(@PathVariable("bookId") Long bookId , Model model) {
		Book book = bookService.findBook(bookId);
		model.addAttribute("book" ,book );
		return "index.jsp";
	}
	@GetMapping("/books")
	public String AllBooks(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books" ,books );
		return "allBooks.jsp";
	}
	
	@RequestMapping("/form")
	public String form() {
		return "form.jsp";
	}
	
	@PostMapping("/book/new")
	public String newBook(
			@RequestParam("title") String title ,
			@RequestParam("description") String description ,
			@RequestParam("language") String language ,
			@RequestParam("pages") Integer pages 
			) {
		Book book = new Book(title, description, language, pages);
		bookService.createBook(book);
		return "redirect:/books";
	}
	
	
	// adding book using modelAttribute (data binding in spring mvc)
	@GetMapping("/new")
	public String newForm(@ModelAttribute("book") Book book) {
		return "form.jsp";
	}
	
	@PostMapping("book/add")
	public String create(@Valid @ModelAttribute("book") Book book , BindingResult result) {
		bookService.createBook(book);
		return "redirect:/books";
	}
	
	/// using form tag and error in jsp page 
	  @GetMapping("/books/new")
	    public String newBook(@ModelAttribute("book") Book book) {
	        return "new.jsp";
	    }
	    @PostMapping("/books")
	    public String createbook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
	        if (result.hasErrors()) {
	            return "new.jsp";
	        } else {
	            bookService.createBook(book);
	            return "redirect:/books";
	        }
	    }
	
}
