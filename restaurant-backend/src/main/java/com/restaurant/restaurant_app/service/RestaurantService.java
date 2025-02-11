package com.restaurant.restaurant_app.service;

import com.restaurant.restaurant_app.model.RestaurantRequest;
import com.restaurant.restaurant_app.model.RestaurantResponse;

import java.util.List;

public interface RestaurantService {

    boolean addRestaurant(RestaurantRequest request);

    List<RestaurantResponse> getRestaurants();

    boolean updateRestaurant(int id, RestaurantRequest request);

    boolean deleteRestaurant(int id);
}
