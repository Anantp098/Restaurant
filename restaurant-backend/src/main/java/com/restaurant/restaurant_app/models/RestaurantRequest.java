package com.restaurant.restaurant_app.models;

public class RestaurantRequest {

    private String name;
    private Long mobile;
    private String address;
    private String city;
    private String state;

    public String getName() {
        return name;
    }

    public Long getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}
