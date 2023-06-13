package com.example.demo3_product.services;

import com.example.demo3_product.models.Factory;
import com.example.demo3_product.repository.FactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("factoryService")
public class FactoryServiceImpl implements allService<Factory>{

    @Autowired
    @Qualifier("factoryRepository")
    private FactoryRepository factoryRepository;

    @Override
    public List<Factory> getAll() {
        return null;
    }

    @Override
    public Factory addProduct(Factory product) {
        return null;
    }

    @Override
    public Factory updateProduct(long id, Factory product) {
        return null;
    }

    @Override
    public boolean deleteProduct(long id) {
        return false;
    }

    @Override
    public Optional findProductId(long id) {
        return Optional.empty();
    }
}
