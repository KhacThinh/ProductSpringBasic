package com.example.demo3_product.repository;

import com.example.demo3_product.models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("productRepository")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
