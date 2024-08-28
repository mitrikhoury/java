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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Products")
public class Products {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  
	  @NotNull(message="Must be not blank")
	  @Size(min=4 , message="must be at least 4 charecters")
	  private String name;
	  
	  
	  @NotNull(message="Must be not blank")
	  @Size(min=4 , message="must be at least 4 charecters")
	  private String description;
	  
	  @Min(value=1)
	  private Integer price;
	  
	  @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	        name = "categories_products", 
	        joinColumns = @JoinColumn(name = "product_id"), 
	        inverseJoinColumns = @JoinColumn(name = "category_id")
	    )
	    private List<Categories> categories;
	  
	  
	  public Products(Long id,
			@NotNull(message = "Must be not blank") @Size(min = 4, message = "must be at least 4 charecters") String name,
			@NotNull(message = "Must be not blank") @Size(min = 4, message = "must be at least 4 charecters") String description,
			@Min(1) Integer price, List<Categories> categories, Date createdAt, Date updatedAt) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.categories = categories;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	    
	public Products() {
	}

	public Products(
			@NotNull(message = "Must be not blank") @Size(min = 4, message = "must be at least 4 charecters") String name,
			@NotNull(message = "Must be not blank") @Size(min = 4, message = "must be at least 4 charecters") String description,
			@Min(1) Integer price, List<Categories> categories, Date createdAt, Date updatedAt) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.categories = categories;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}




	@Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
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

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getPrice() {
			return price;
		}

		public void setPrice(Integer price) {
			this.price = price;
		}

		public List<Categories> getCategories() {
			return categories;
		}

		public void setCategories(List<Categories> categories) {
			this.categories = categories;
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
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
}
