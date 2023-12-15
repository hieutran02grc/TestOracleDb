package com.petshop.PetShop.controller;

import com.petshop.PetShop.model.User;
import com.petshop.PetShop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllTutorials() {
        try {
            List<User> lstUser = new ArrayList<User>();

            lstUser = userRepository.findAll();

            return new ResponseEntity<>(lstUser, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
