package com.petshop.PetShop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USERS")
@Getter
@Setter
public class User {

    public User() {}

    @Id
    private Integer ID;

    @Column(name = "EMAIL")
    private String EMAIL;

    @Column(name = "SDT")
    private String SDT;

    @Column(name = "USERNAME")
    private String USERNAME;

    @Column(name = "PASSWORD")
    private String PASSWORD;

    @Column(name = "ADDRESS")
    private String ADDRESS;

}
