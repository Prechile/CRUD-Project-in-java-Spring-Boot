package com.prechile.project.Service;

import com.prechile.project.model.Product;

import java.util.List;

public interface ProductService {

    Product create(Product product);
    List<Product> getAll();
    Product update(Long id, Product product);
    String delete(Long id);


}
