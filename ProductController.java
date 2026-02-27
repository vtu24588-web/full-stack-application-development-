package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    // ✅ POST — Add new product
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    // ✅ GET — Retrieve all products
    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
    @PostMapping("/bulk")
    public List<Product> addMultipleProducts(@RequestBody List<Product> products) {
        return repository.saveAll(products);
    }
}