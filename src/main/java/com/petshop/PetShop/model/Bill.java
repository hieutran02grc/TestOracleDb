package com.petshop.PetShop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Bill {
    @Id
    private long id;
    private Date dateCreated;
    private String paymentMethod;
    private long userId;

    // Constructors
    public Bill() {
    }

    public Bill(long id, Date dateCreated, String paymentMethod, long userId) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.paymentMethod = paymentMethod;
        this.userId = userId;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", userId=" + userId +
                '}';
    }
}

