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
@Table(name = "restro_owner_relationship")
public class RestaurantOwnerRelationshipDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "restro_id", referencedColumnName = "restro_id")
    private RestaurantDetails restaurant;

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "owner_id")
    private RestaurantOwnerDetails owner;
}
