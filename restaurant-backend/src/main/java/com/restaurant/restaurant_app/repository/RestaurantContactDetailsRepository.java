package com.restaurant.restaurant_app.repository;

import com.restaurant.restaurant_app.entity.RestaurantContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantContactDetailsRepository extends JpaRepository<RestaurantContactDetails, Integer> {
}
