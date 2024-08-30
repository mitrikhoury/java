package com.axsos.authentication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.authentication.Models.Book;
import com.axsos.authentication.Models.User;
import com.axsos.authentication.Service.BookService;
import com.axsos.authentication.Service.UserService;


import jakarta.servlet.http.HttpSession;


public class BookController {

	@Autowired
    private BookService bookService;
    @Autowired
    private UserService userService;

    @GetMapping("/books")
    public String listBooks(Model model, HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        if (userId != null) {
            model.addAttribute("books", bookService.allBok());
            User user = userService.findById(userId);
            model.addAttribute("user", user);
            return "books";
        }
        return "redirect:/login";
    }

    @GetMapping("/books/new")
    public String showNewBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "newBook";
    }

    @PostMapping("/books")
    public String addBook(@ModelAttribute("book") Book book, HttpSession session , Model model) {
        Long userId = (Long) session.getAttribute("userId");
        if (userId != null) {
            User user = userService.findById(userId);
           // book.setUser(user);
            bookService.createBook(book);
            return "redirect:/books";
        }
        return "redirect:/login";
    }

    @GetMapping("/books/{id}")
    public String showBookDetails(@PathVariable("id") Long id, HttpSession session ,Model model) {
    	Long userId = (Long) session.getAttribute("userId");
    	if (userId != null) {
            User user = userService.findById(userId);
            model.addAttribute("user" , user);
            }
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        return "bookDetails";
    }

    @GetMapping("/books/{id}/edit")
    public String showEditBookForm(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        return "editBook";
    }

    @PostMapping("/books/{id}")
    public String updateBook(@PathVariable("id") Long id, @ModelAttribute("book") Book updatedBook) {
        Book book = bookService.findById(id);
        book.setTitle(updatedBook.getTitle());
        book.setAuthor(updatedBook.getAuthor());
        book.setThoughts(updatedBook.getThoughts());
        bookService.createBook(book);
        return "redirect:/books";
    }

    @PostMapping("/books/{id}/delete")
    public String deleteBook(@PathVariable("id") Long id) {
        bookService.deleteById(id);
        return "redirect:/books";
    }
}
