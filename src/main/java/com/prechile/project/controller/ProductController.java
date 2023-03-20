package com.prechile.project.controller;

import com.prechile.project.Service.ProductService;
import com.prechile.project.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/Create")
    public Product createProduct(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping("/GetAll")
    public List<Product> getAllProduct(){
        return  productService.getAll();
    }

    @PutMapping("/Update/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        return productService.update(id, product);
    }

    @DeleteMapping("/Delete")
    public String deleteProduct(@PathVariable Long id){
        return productService.delete(id);
    }

}
