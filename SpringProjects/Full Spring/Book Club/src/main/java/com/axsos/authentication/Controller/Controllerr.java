package com.axsos.authentication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.authentication.Models.Book;
import com.axsos.authentication.Models.LoginUser;
import com.axsos.authentication.Models.User;
import com.axsos.authentication.Service.BookService;
import com.axsos.authentication.Service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;



@Controller
public class Controllerr {

	
	 @Autowired
	    private UserService userServ;

	    @Autowired
	    private BookService bookServ;

	    @GetMapping("/")
	    public String index(Model model) {
	        model.addAttribute("newUser", new User());
	        model.addAttribute("newLogin", new LoginUser());
	        return "home";
	    }

	    @PostMapping("/register")
	    public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model, HttpSession session) {
	        User user = userServ.register(newUser, result);
	        if(result.hasErrors()) {
	            model.addAttribute("newLogin", new LoginUser());
	            return "home";
	        }
	        session.setAttribute("userId", user.getId());
	        session.setAttribute("user", user);
	        
	        return "redirect:/bookmarket";
	    }

	    @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session) {
	        User user = userServ.login(newLogin, result);
	        if(result.hasErrors() || user == null) {
	            model.addAttribute("newUser", new User());
	            return "home";
	        }
	        session.setAttribute("userId", user.getId());
	        session.setAttribute("user", user);
	        return "redirect:/bookmarket";
	    }

	    @GetMapping("/logout")
	    public String logout(HttpSession session) {
	        session.setAttribute("userId", null);
	        return "redirect:/";
	    }

	    @GetMapping("/books")
	    public String showBooks(HttpSession session, Model model) {
	        if(session.getAttribute("userId") == null) {
	            return "redirect:/logout";
	        }
	        List<Book> books = bookServ.allBok();
	        model.addAttribute("books", books);
	        return "books";
	    }

	    @GetMapping("/books/{id}")
	    public String showBook(@PathVariable("id") Long id, HttpSession session, Model model) {
	        Long userId = (Long) session.getAttribute("userId");
	        if(userId == null) {
	            return "redirect:/logout";
	        }
	        model.addAttribute("user", userServ.findById(userId));
	        Book book = bookServ.findById(id);
	        model.addAttribute("book", book);
	        return "bookDetails";
	    }

	    @GetMapping("/books/edit/{id}")
	    public String edit(@PathVariable("id") Long id, HttpSession session, Model model) {
	        if(session.getAttribute("userId") == null) {
	            return "redirect:/logout";
	        }
	        Book book = bookServ.findById(id);
	        model.addAttribute("book" , book);
	        return "editBook";
	    }

	    @PostMapping("/books/edit/{id}")
	    public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
	        if(session.getAttribute("userId") == null) {
	            return "redirect:/logout";
	        }
	        if(result.hasErrors()) {
	            return "editBook";
	        }
	        User user =  (User) session.getAttribute("user");
	        book.setOwner(user);
	        bookServ.updateBook(book);
	        return "redirect:/bookmarket";
	    }

	    @GetMapping("/books/new")
	    public String addBook(@ModelAttribute("book") Book book, HttpSession session) {
	        if(session.getAttribute("userId") == null) {
	            return "redirect:/logout";
	        }
	        return "newBook";
	    }

	    @PostMapping("/books/new")
	    public String addBook(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
	        Long userId = (Long) session.getAttribute("userId");
	        if(userId == null) {
	            return "redirect:/logout";
	        }
	        if(result.hasErrors()) {
	            return "newBook";
	        }
	        User us = userServ.findById(userId);
	        book.setOwner(us);
	        bookServ.createBook(book);
	        return "redirect:/books";
	    }

	    @RequestMapping("/books/delete/{id}")
	    public String deleteBook(@PathVariable("id") Long id, HttpSession session) {
	        if(session.getAttribute("userId") == null) {
	            return "redirect:/logout";
	        }
	        bookServ.deleteBook(bookServ.findById(id));
	        return "redirect:/books";
	    }

	    @GetMapping("/bookmarket")
	    public String bookmarket(HttpSession session, Model model) {
	        Long userId = (Long) session.getAttribute("userId");
	        if(userId == null) {
	            return "redirect:/logout";
	        }
	        model.addAttribute("user", userServ.findById(userId));
	        List<Book> books = bookServ.unborrowedBooks(userServ.findById(userId));
	        model.addAttribute("books", books);
	        List<Book> myBooks = bookServ.borrowedBooks(userServ.findById(userId));
	        model.addAttribute("myBooks", myBooks);
	        return "bookMarket";
	    }

	    @RequestMapping("/bookmarket/{bookID}")
	    public String borrowBook(@PathVariable("bookID") Long bookID, HttpSession session) {
	        Long userId = (Long) session.getAttribute("userId");
	        if(userId == null) {
	            return "redirect:/logout";
	        }
	        bookServ.addBorrower(bookServ.findById(bookID), userServ.findById(userId));
	        return "redirect:/bookmarket";
	    }

	    @RequestMapping("/bookmarket/return/{bookID}")
	    public String returnBook(@PathVariable("bookID") Long bookID, HttpSession session) {
	        if(session.getAttribute("userId") == null) {
	            return "redirect:/logout";
	        }
	        bookServ.removeBorrower(bookServ.findById(bookID));
	        return "redirect:/bookmarket";
	    }
}
