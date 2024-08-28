package com.axsos.ProductsAndCategories.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.ProductsAndCategories.Models.Categories;
import com.axsos.ProductsAndCategories.Services.CategoriesService;

@Controller
@RequestMapping("/categories")
public class CategoryController {

	    @Autowired
	    private CategoriesService categoryService;

	    @GetMapping("/{id}")
	    public Categories getCategoryById(@PathVariable Long id) {
	        return categoryService.findById(id);
	    }

	    @PostMapping
	    public Categories createNewCategory(@RequestBody Categories category) {
	        return categoryService.addCategory(category);
	    }

	    @PutMapping("/{id}")
	    public Categories updateCategory(@PathVariable Long id, @RequestBody Categories updatedCategory) {
	        return categoryService.updateCategory(id, updatedCategory);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteCategory(@PathVariable Long id) {
	        categoryService.delete(id);
	    }

}
