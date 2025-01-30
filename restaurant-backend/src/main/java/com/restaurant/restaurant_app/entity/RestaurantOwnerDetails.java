package com.restaurant.restaurant_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant_owner")
public class RestaurantOwnerDetails {

    @Id
    @Column(name = "owner_id")
    private int ownerId;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "passport", length = 20, unique = true)
    private String passport;

    // Getters and Setters

    public int getOwnerId() {
        return ownerId;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
