package com.restaurant.restaurant_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant_contact")
public class RestaurantContactDetails {

    @Id
    @Column(name = "contacts_id")
    private int contactsId;

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private RestaurantAddressDetails address;

    @Column(name = "mobile", length = 20, nullable = false)
    private String mobile;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    // Getters and Setters

    public int getContactsId() {
        return contactsId;
    }

    public RestaurantAddressDetails getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setContactsId(int contactsId) {
        this.contactsId = contactsId;
    }

    public void setAddress(RestaurantAddressDetails address) {
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
