package com.petshop.PetShop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
public class Product {
    public Product() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "PRICE")
    private Float price;
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "BRAND_ID")
    private Integer brandId;
    @Column(name = "IMG_URL")
    private String imgUrl;
}
