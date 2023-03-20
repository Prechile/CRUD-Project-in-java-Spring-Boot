package com.prechile.project.Service;

import com.prechile.project.model.Product;
import com.prechile.project.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public Product create(Product product) {
       return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product update(Long id, Product product) {
        return productRepository.findById(id)
                .map(p->{
                    p.setName(product.getName());
                    p.setDescription(product.getDescription());
                    p.setPrix(product.getPrix());
                    return productRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("No product found"));
    }

    @Override
    public String delete(Long id) {
        productRepository.deleteById(id);
        return "prduct deleted";
    }
}
