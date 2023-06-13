package com.example.demo3_product.services;

import com.example.demo3_product.models.Product;
import com.example.demo3_product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("productService")
public class ProductServiceImpl implements allService<Product> {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        List<Product> list = productRepository.findAll();
        if (!list.isEmpty()) {
            return list;
        }
        return null;
    }

    @Override
    public Product addProduct(Product p) {
        Product product = productRepository.save(p);
        return product;
    }

    @Override
    public Product updateProduct(long id, Product p) {
        Product product = p;
        if (product != null) {
            p.setId(id);
            productRepository.save(p);
        }
        return null;
    }

    @Override
    public boolean deleteProduct(long id) {
        Optional<Product> product = Optional.of(productRepository.getById(id));
        return false;
    }

    @Override
    public Optional findProductId(long id) {
        Optional<Product> product = productRepository.findById(id);
        return product;
    }
}
