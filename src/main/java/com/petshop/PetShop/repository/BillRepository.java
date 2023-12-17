package com.petshop.PetShop.repository;


import com.petshop.PetShop.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
    // Additional custom queries can be added here if needed
}
