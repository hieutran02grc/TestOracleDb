package com.petshop.PetShop.service;

import com.petshop.PetShop.model.Product;
import com.petshop.PetShop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product addProduct(Product location){
        return repository.save(location);
    }
}
