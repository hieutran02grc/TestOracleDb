package com.petshop.PetShop.repository;

import com.petshop.PetShop.model.Product;
import com.petshop.PetShop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}