package com.example.demo3_product.services;


import java.util.List;
import java.util.Optional;

public interface allService<T> {

    public List<T> getAll();

    public T addProduct(T product);

    public T updateProduct(long id, T product);

    public boolean deleteProduct(long id);

    public Optional findProductId(long id);
}
