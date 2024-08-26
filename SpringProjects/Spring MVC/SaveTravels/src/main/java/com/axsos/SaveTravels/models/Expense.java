package com.axsos.SaveTravels.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "expense")
public class Expense {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Must be not empty blank")
	@Size(min = 5, max = 200, message = "Name must be at least 5 characters.")
	private String expense_name;
	
	@NotNull(message = "Must be not empty blank")
	@Size(min = 5, max = 200, message = "vendor must be at least 5 characters.")
	private String vendor;
	
	
	@NotNull(message = "Must be not empty blank")
	private double amount;
	
	@NotNull(message = "Must be not empty blank")
	@Size(min = 5, max = 200, message = "description must be at least 5 characters.")
	private String description;
	

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public Expense() {
		super();
	}

	public Expense(Long id,
			@NotNull(message = "Must be not empty blank") @Size(min = 5, max = 200, message = "Name must be at least 5 characters.") String expense_name,
			@NotNull(message = "Must be not empty blank") @Size(min = 5, max = 200, message = "vendor must be at least 5 characters.") String vendor,
			@NotNull(message = "Must be not empty blank") double amount,
			@NotNull(message = "Must be not empty blank") @Size(min = 5, max = 200, message = "description must be at least 5 characters.") String description,
			Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.expense_name = expense_name;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Expense(
			@NotNull(message = "Must be not empty blank") @Size(min = 5, max = 200, message = "Name must be at least 5 characters.") String expense_name,
			@NotNull(message = "Must be not empty blank") @Size(min = 5, max = 200, message = "vendor must be at least 5 characters.") String vendor,
			@NotNull(message = "Must be not empty blank") double amount,
			@NotNull(message = "Must be not empty blank") @Size(min = 5, max = 200, message = "description must be at least 5 characters.") String description,
			Date createdAt, Date updatedAt) {
		super();
		this.expense_name = expense_name;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpense_name() {
		return expense_name;
	}

	public void setExpense_name(String expense_name) {
		this.expense_name = expense_name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
