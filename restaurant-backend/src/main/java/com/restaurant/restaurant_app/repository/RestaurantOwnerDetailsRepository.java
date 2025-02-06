package com.restaurant.restaurant_app.repository;

import com.restaurant.restaurant_app.entity.RestaurantOwnerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantOwnerDetailsRepository extends JpaRepository<RestaurantOwnerDetails, Integer> {
}
