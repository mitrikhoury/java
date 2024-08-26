package com.axsos.Languages.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name ="Languages")
public class Languages {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Must be not empty blank")
	@Size(min = 2, max = 20, message = "Name must be at least 2 characters.")
	private String name;
	
	@NotNull(message = "Must be not empty blank")
	@Size(min = 2, max = 20, message = "Creator must be at least 2 characters.")
	private String Creator ;
	
	@NotNull(message = "Must be not empty blank")
	@Size(min = 2, max = 20, message = "Creator must be at least 2 characters.")
	private String version;

	public Languages(Long id,
			@NotNull(message = "Must be not empty blank") @Size(min = 2, max = 20, message = "Name must be at least 2 characters.") String name,
			@NotNull(message = "Must be not empty blank") @Size(min = 2, max = 20, message = "Creator must be at least 2 characters.") String creator,
			@NotNull(message = "Must be not empty blank") @Size(min = 2, max = 20, message = "Creator must be at least 2 characters.") String version) {
		this.id = id;
		this.name = name;
		Creator = creator;
		this.version = version;
	}

	public Languages(
			@NotNull(message = "Must be not empty blank") @Size(min = 2, max = 20, message = "Name must be at least 2 characters.") String name,
			@NotNull(message = "Must be not empty blank") @Size(min = 2, max = 20, message = "Creator must be at least 2 characters.") String creator,
			@NotNull(message = "Must be not empty blank") @Size(min = 2, max = 20, message = "Creator must be at least 2 characters.") String version) {
		this.name = name;
		Creator = creator;
		this.version = version;
	}

	public Languages() {
	}

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

	public String getCreator() {
		return Creator;
	}

	public void setCreator(String creator) {
		Creator = creator;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
}  
    












