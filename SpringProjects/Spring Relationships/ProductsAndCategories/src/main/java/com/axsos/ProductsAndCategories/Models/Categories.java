package com.axsos.ProductsAndCategories.Models;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "categories")
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Must be not blank")
	@Size(min = 4, message = "must be at least 4 charecters")
	private String name;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "categories_products", joinColumns = @JoinColumn(name = "category_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	private List<Products> products;

	public Categories(Long id,
			@NotNull(message = "Must be not blank") @Size(min = 4, message = "must be at least 4 charecters") String name,
			List<Products> products, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Categories() {
		super();
	}

	public Categories(
			@NotNull(message = "Must be not blank") @Size(min = 4, message = "must be at least 4 charecters") String name,
			List<Products> products, Date createdAt, Date updatedAt) {
		super();
		this.name = name;
		this.products = products;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
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

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
}
