package com.example.demo3_product.services;

import com.example.demo3_product.models.OrderProduct;
import com.example.demo3_product.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements allService<OrderProduct>{

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<OrderProduct> getAll() {
        return null;
    }

    @Override
    public OrderProduct addProduct(OrderProduct product) {
        OrderProduct orderProduct = orderRepository.save(product);
        return orderProduct;
    }

    @Override
    public OrderProduct updateProduct(long id, OrderProduct product) {
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
