package com.restaurant.restaurant_app.repository;

import com.restaurant.restaurant_app.entity.RestaurantOwnerRelationshipDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantOwnerRelationshipDetailsRepository extends JpaRepository<RestaurantOwnerRelationshipDetails, Integer> {
}
