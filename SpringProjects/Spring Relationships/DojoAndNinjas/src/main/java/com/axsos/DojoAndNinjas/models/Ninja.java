package com.axsos.DojoAndNinjas.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Ninja")
public class Ninja {
	
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;

	  @NotNull(message="Must be not blank")
	  @Size(min=4 , message="must be at least 4 charecters")
	  private String firstName;
	  
	  @NotNull(message="Must be not blank")
	  @Size(min=4 , message="must be at least 4 charecters")
	  private String lastName;
	  
	  @NotNull(message="Must be not blank")
	  @Min(value=18 , message="Must be at least 18 old years..")
	  private int age;
	  
	  @Column(updatable=false)
	  @DateTimeFormat(pattern="yyyy-MM-dd")
	  private Date createdAt;
	  @DateTimeFormat(pattern="yyyy-MM-dd")
	  private Date updatedAt;
	    
	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name="dojo_id")
	  private Dojo dojo;
	  
	  public Ninja(Long id,
			@NotNull(message = "Must be not blank") @Size(min = 4, message = "must be at least 4 charecters") String firstName,
			@NotNull(message = "Must be not blank") @Size(min = 4, message = "must be at least 4 charecters") String lastName,
			@NotNull(message = "Must be not blank") @Min(value = 18, message = "Must be at least 18 old years..") int age,
			Date createdAt, Date updatedAt, Dojo dojo) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.dojo = dojo;
	}
	  
	  
	public Ninja(
			@NotNull(message = "Must be not blank") @Size(min = 4, message = "must be at least 4 charecters") String firstName,
			@NotNull(message = "Must be not blank") @Size(min = 4, message = "must be at least 4 charecters") String lastName,
			@NotNull(message = "Must be not blank") @Min(value = 18, message = "Must be at least 18 old years..") int age,
			Date createdAt, Date updatedAt, Dojo dojo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.dojo = dojo;
	}

	public Ninja() {
	}

	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
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


	public Dojo getDojo() {
		return dojo;
	}


	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
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
