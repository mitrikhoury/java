package com.axsos.ProductsAndCategories.Repositiores;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.ProductsAndCategories.Models.Categories;
import com.axsos.ProductsAndCategories.Models.Products;

@Repository
public interface CategoryRepositiory extends CrudRepository<Categories, Long>{

	 List<Categories> findAllByProducts(Products product);
	    
	 List<Categories> findAll();
	    // Retrieves a list of any categories a particular product
	    // does not belong to.
	    List<Categories> findByProductsNotContains(Products product);
}
