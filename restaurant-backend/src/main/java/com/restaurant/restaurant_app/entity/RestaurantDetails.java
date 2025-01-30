package com.restaurant.restaurant_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant")
public class RestaurantDetails {

    @Id
    @Column(name = "restro_id")
    private int restroId;

    @Column(name = "restro_name", length = 100, nullable = false)
    private String restroName;

    @Column(name = "restro_type", nullable = false)
    private String restroType;

    @ManyToOne
    @JoinColumn(name = "base_address_id", referencedColumnName = "address_id")
    private RestaurantAddressDetails baseAddress;

    // Getters and Setters

    public int getRestroId() {
        return restroId;
    }

    public String getRestroName() {
        return restroName;
    }

    public String getRestroType() {
        return restroType;
    }

    public RestaurantAddressDetails getBaseAddress() {
        return baseAddress;
    }

    public void setRestroId(int restroId) {
        this.restroId = restroId;
    }

    public void setRestroName(String restroName) {
        this.restroName = restroName;
    }

    public void setRestroType(String restroType) {
        this.restroType = restroType;
    }

    public void setBaseAddress(RestaurantAddressDetails baseAddress) {
        this.baseAddress = baseAddress;
    }
}
