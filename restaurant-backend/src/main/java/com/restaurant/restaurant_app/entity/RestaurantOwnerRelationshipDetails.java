package com.restaurant.restaurant_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restro_owner_relationship")
public class RestaurantOwnerRelationshipDetails {

    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "restro_id", referencedColumnName = "restro_id")
    private RestaurantDetails restaurant;

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "owner_id")
    private RestaurantOwnerDetails owner;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public RestaurantDetails getRestaurant() {
        return restaurant;
    }

    public RestaurantOwnerDetails getOwner() {
        return owner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRestaurant(RestaurantDetails restaurant) {
        this.restaurant = restaurant;
    }

    public void setOwner(RestaurantOwnerDetails owner) {
        this.owner = owner;
    }
}
