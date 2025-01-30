package com.restaurant.restaurant_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant_address")
public class RestaurantAddressDetails {

    @Id
    @Column(name = "address_id")
    private int addressId;

    @ManyToOne
    @JoinColumn(name = "restro_id", referencedColumnName = "restro_id")
    private RestaurantDetails restaurant;

    @Column(name = "address_line1", length = 200, nullable = false)
    private String addressLine1;

    @Column(name = "address_line2", length = 200)
    private String addressLine2;

    @Column(name = "city", length = 50, nullable = false)
    private String city;

    @Column(name = "state", length = 50, nullable = false)
    private String state;

    @Column(name = "country", length = 50, nullable = false)
    private String country;

    @Column(name = "pincode", length = 10, nullable = false)
    private String pincode;

    @Column(name = "landmark", length = 200)
    private String landmark;

    // Getters and Setters

    public int getAddressId() {
        return addressId;
    }

    public RestaurantDetails getRestaurant() {
        return restaurant;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getPincode() {
        return pincode;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public void setRestaurant(RestaurantDetails restaurant) {
        this.restaurant = restaurant;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
}
