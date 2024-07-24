package com.platzi.platzi_market.web.controller;

import com.platzi.platzi_market.domain.Product;
import com.platzi.platzi_market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController // controlar de una api rest
@RequestMapping("/products") //lleva como parametro en que path va a recibir las peticiones que se hagan
public class ProductController {
    @Autowired
    private ProductService productService;

    public List<Product> getAll() {
        return productService.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return productService.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return productService.getByCategory(categoryId);
    }

    public Product save(Product product) { //resive el producto que quiere guardar
        return productService.save(product);
    }

    public boolean delete(int productId) {
        return productService.delete(productId);
    }
}