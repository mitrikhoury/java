package com.axsos.ProductsAndCategories.Repositiores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.ProductsAndCategories.Models.Categories;
import com.axsos.ProductsAndCategories.Models.Products;

@Repository
public interface ProductRepositiory  extends CrudRepository<Products, Long>{

	List<Products> findAll();
	List<Products> findAllByCategories(Categories c);
	Products findByIdIs(Long id);
	List<Products> findByCategoriesNotContains(Categories category);

}
