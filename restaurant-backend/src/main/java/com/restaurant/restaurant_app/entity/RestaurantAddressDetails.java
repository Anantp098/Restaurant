package com.restaurant.restaurant_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "restaurant_address")
public class RestaurantAddressDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
