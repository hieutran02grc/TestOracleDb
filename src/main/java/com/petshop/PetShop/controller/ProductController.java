package com.petshop.PetShop.controller;

import com.petshop.PetShop.model.Product;
import com.petshop.PetShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add_product")
    public ResponseEntity<Product> addLocation(@RequestBody Product product){
        try {
            Product addedProduct = productService.addProduct(product);

            return new ResponseEntity<>(addedProduct, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
