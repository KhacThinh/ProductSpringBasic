package com.example.demo3_product.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten", length = 30, unique = true, nullable = false)
    private String ten;

    @Column(name = "soLuong", nullable = false)
    private int soLuong;

    @Column(name = "nsx", nullable = false)
    private String nsx;

    @Column(name = "hsd", nullable = false)
    private String hsd;

    @ManyToOne
    @JoinColumn(name = "factory_id")
    private Factory factory;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderProduct orderProduct;
}
