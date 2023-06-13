package com.example.demo3_product.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "orderProduct")
public class OrderProduct {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "orderProduct")
    private List<Product> products;

    public OrderProduct() {
    }

    public OrderProduct(String name, List<Product> products) {
        this.name = name;
        products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getIdProduct() {
        return products;
    }

    public void setIdProduct(List<Product> idProduct) {
        products = idProduct;
    }
}
