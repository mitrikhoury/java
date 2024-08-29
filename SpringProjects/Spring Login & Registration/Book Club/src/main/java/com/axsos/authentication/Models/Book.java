package com.axsos.authentication.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "Title is required!")
	@Size(min = 3, max = 30, message = "Title must be between 3 and 30 characters")
	private String title;

	@NotEmpty(message = "author is required!")
	@Size(min = 3, max = 30, message = "author must be between 3 and 30 characters")
	private String author;

	@NotEmpty(message = "thoughts is required!")
	@Size(min = 5, max = 50, message = "thoughts must be between 5 and 50 characters")
	private String thoughts;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	public Book(Long id,
			@NotEmpty(message = "Title is required!") @Size(min = 3, max = 30, message = "Title must be between 3 and 30 characters") String title,
			@NotEmpty(message = "author is required!") @Size(min = 3, max = 30, message = "author must be between 3 and 30 characters") String author,
			@NotEmpty(message = "thoughts is required!") @Size(min = 5, max = 50, message = "thoughts must be between 5 and 50 characters") String thoughts,
			User user) {

		this.id = id;
		this.title = title;
		this.author = author;
		this.thoughts = thoughts;
		this.user = user;
	}

	public Book() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getThoughts() {
		return thoughts;
	}

	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}
