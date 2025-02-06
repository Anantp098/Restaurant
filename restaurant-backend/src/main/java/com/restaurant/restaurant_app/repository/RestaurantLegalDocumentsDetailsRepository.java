package com.restaurant.restaurant_app.repository;

import com.restaurant.restaurant_app.entity.RestaurantLegalDocumentsDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantLegalDocumentsDetailsRepository extends JpaRepository<RestaurantLegalDocumentsDetails, Integer> {
}
