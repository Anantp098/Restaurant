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
@Table(name = "restaurant_legal_documents")
public class RestaurantLegalDocumentsDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "legal_id")
    private int legalId;

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private RestaurantAddressDetails address;

    @Column(name = "food_license", length = 30, unique = true)
    private String foodLicense;
}
