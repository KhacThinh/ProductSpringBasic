package com.example.demo3_product.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@Data
@Entity
@NoArgsConstructor
@Table(name = "factory")
public class Factory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "factory")
    private List<Product> product;

    public Factory(String name, String address, List<Product> product) {
        this.name = name;
        this.address = address;
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Factory factory)) return false;
        return Objects.equals(getId(), factory.getId()) && Objects.equals(getName(), factory.getName()) && Objects.equals(getAddress(), factory.getAddress()) && Objects.equals(getProduct(), factory.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress(), getProduct());
    }
}
