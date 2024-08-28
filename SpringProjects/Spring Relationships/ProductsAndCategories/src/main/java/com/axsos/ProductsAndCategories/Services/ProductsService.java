package com.axsos.ProductsAndCategories.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.ProductsAndCategories.Models.Categories;
import com.axsos.ProductsAndCategories.Models.Products;
import com.axsos.ProductsAndCategories.Repositiores.ProductRepositiory;

@Service
public class ProductsService {

	private final ProductRepositiory productRepositiory;

	public ProductsService(ProductRepositiory productRepositiory) {
		this.productRepositiory = productRepositiory;
	}
	
	public List<Products> allProducts(){
		return productRepositiory.findAll();
	}
	
	public List<Products> findAllByCategories(Categories c){
		return productRepositiory.findAllByCategories(c);
	}
	
	public Products findProductById(Long id) {
		return productRepositiory.findByIdIs(id);
	}
	
	public List<Products> findByCategoriesNotContains(Categories  c){
		return productRepositiory.findByCategoriesNotContains(c);
	}
	
	public Products createProducts(Products p) {
		return productRepositiory.save(p);
	}
	
	public Products update(Products p) {
		return productRepositiory.save(p);
	}
	public void deleteProduct(Products p) {
		 productRepositiory.delete(p);
	}
	public void deleteById(Long id) {
		productRepositiory.deleteById(id);
	}
}
