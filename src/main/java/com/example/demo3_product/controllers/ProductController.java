package com.example.demo3_product.controllers;

import com.example.demo3_product.models.OrderProduct;
import com.example.demo3_product.models.Product;
import com.example.demo3_product.services.allService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ProductController {

    @Autowired
    private allService<Product> productSerivce;

//    @Autowired
//    private allService<OrderProduct> orderProductall;

    @GetMapping("")
    public ResponseEntity<List> getAll() {
        return ResponseEntity.ok(productSerivce.getAll());
    }

    @PostMapping("")
    public ResponseEntity<Product> addProduct(@RequestBody Product product, Model model) {

        if (ObjectUtils.isEmpty(product)) {
            return ResponseEntity.ok(productSerivce.addProduct(product));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable(value = "id", name = "0", required = true) long id, @RequestBody Product product) {
        Optional optional = productSerivce.getAll().stream().filter(i -> i.getId() == id).findFirst();
        if (optional == null) {
            return ResponseEntity.notFound().build();
        } else {
            Product product1 = (Product) optional.get();
            return ResponseEntity.ok(product1);
        }
    }

    @DeleteMapping("/delete")
    public String deleteProduct(@RequestParam("id") Long id) {
        boolean b = productSerivce.deleteProduct(id);
        if (b) {
            return "Xóa id " + id + "Thành Công!";
        } else {
            return "Xóa id " + id + " Không Thành Công!";
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") long id) {
        return ResponseEntity.ok(productSerivce.findProductId(id));
    }
}
