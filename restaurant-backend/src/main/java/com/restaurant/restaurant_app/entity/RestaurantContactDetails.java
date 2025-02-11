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
@Table(name = "restaurant_contact")
public class RestaurantContactDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contacts_id")
    private int contactsId;

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private RestaurantAddressDetails address;

    @Column(name = "mobile", length = 20, nullable = false)
    private String mobile;

    @Column(name = "email", length = 100, nullable = false)
    private String email;
}
