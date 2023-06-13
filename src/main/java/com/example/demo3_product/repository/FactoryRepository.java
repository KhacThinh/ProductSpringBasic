package com.example.demo3_product.repository;

import com.example.demo3_product.models.Factory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("factoryRepository")
public interface FactoryRepository extends JpaRepository<Factory, Long> {
}
