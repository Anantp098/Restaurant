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
@Table(name = "restaurant")
public class RestaurantDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restro_id")
    private int restroId;

    @Column(name = "restro_name", length = 100, nullable = false)
    private String restroName;

    @Column(name = "restro_type", nullable = false)
    private String restroType;

    @ManyToOne
    @JoinColumn(name = "base_address_id", referencedColumnName = "address_id")
    private RestaurantAddressDetails baseAddress;
}
