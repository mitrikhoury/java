package com.axsos.ProductsAndCategories.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.ProductsAndCategories.Models.Categories;
import com.axsos.ProductsAndCategories.Models.Products;
import com.axsos.ProductsAndCategories.Repositiores.CategoryRepositiory;

@Service
public class CategoriesService {

	private final CategoryRepositiory categoryRepositiory;

	public CategoriesService(CategoryRepositiory categoryRepositiory) {
		this.categoryRepositiory = categoryRepositiory;
	}
	
	public List<Categories> allCategories(){
		return categoryRepositiory.findAll();
	}
	
	public List<Categories> getAssignedProducts(Products product){
		return categoryRepositiory.findAllByProducts(product);
	}
	
	public List<Categories> getUnassignedProducts(Products product){
		return categoryRepositiory.findByProductsNotContains(product);
	}
	
	public Categories findById(Long id) {
		Optional<Categories> optionalCategory = categoryRepositiory.findById(id);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();
		}else {
			return null;
		}
	}
	
	public Categories addCategory(Categories category) {
		return categoryRepositiory.save(category);
	}
	
	public Categories updateCategory(Long id, Categories category) {
		return categoryRepositiory.save(category);
	}
	
	public void deleteCategory(Categories category) {
		categoryRepositiory.delete(category);
	}

	public void delete(Long id) {
		categoryRepositiory.deleteById(id);
		
	}
}
