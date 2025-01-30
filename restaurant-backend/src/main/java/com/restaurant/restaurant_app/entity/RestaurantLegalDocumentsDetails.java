package com.restaurant.restaurant_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant_legal_documents")
public class RestaurantLegalDocumentsDetails {

    @Id
    @Column(name = "legal_id")
    private int legalId;

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private RestaurantAddressDetails address;

    @Column(name = "food_license", length = 30, unique = true)
    private String foodLicense;

    // Getters and Setters

    public int getLegalId() {
        return legalId;
    }

    public RestaurantAddressDetails getAddress() {
        return address;
    }

    public String getFoodLicense() {
        return foodLicense;
    }

    public void setLegalId(int legalId) {
        this.legalId = legalId;
    }

    public void setAddress(RestaurantAddressDetails address) {
        this.address = address;
    }

    public void setFoodLicense(String foodLicense) {
        this.foodLicense = foodLicense;
    }
}
