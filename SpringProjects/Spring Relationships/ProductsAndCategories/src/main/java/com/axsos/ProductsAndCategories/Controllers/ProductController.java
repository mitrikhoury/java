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

import com.axsos.ProductsAndCategories.Models.Products;
import com.axsos.ProductsAndCategories.Services.ProductsService;

@Controller
@RequestMapping("/products")
public class ProductController {

	 @Autowired
	    private ProductsService productService;

	    @GetMapping("/{id}")
	    public Products getProductById(@PathVariable Long id) {
	        return productService.findProductById(id);
	    }

	    @PostMapping
	    public Products createNewProduct(@RequestBody Products product) {
	        return productService.createProducts(product);
	    }

	    @PutMapping("/{id}")
	    public Products updateProduct(@PathVariable Long id, @RequestBody Products updatedProduct) {
	        return productService.update(updatedProduct);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteProduct(@PathVariable Long id) {
	        productService.deleteById(id);
	    }
}
