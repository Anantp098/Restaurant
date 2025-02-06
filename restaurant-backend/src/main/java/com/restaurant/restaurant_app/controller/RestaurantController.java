package com.restaurant.restaurant_app.controller;

import com.restaurant.restaurant_app.model.RestaurantRequest;
import com.restaurant.restaurant_app.model.RestaurantResponse;
import com.restaurant.restaurant_app.service.RestaurantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    public ResponseEntity<List<RestaurantResponse>> getAllRestaurants() {
        List<RestaurantResponse> restaurantList = restaurantService.getRestaurants();
        return ResponseEntity.ok(restaurantList);
    }

    @PostMapping
    public ResponseEntity<String> addRestaurant(@RequestBody RestaurantRequest request) {
        boolean isAdded = restaurantService.addRestaurant(request);
        return isAdded ? ResponseEntity.ok("Restaurant added successfully") : ResponseEntity.status(400).body("Failed to add restaurant");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateRestaurant(@PathVariable int id, @RequestBody RestaurantRequest request) {
        boolean isUpdated = restaurantService.updateRestaurant(id, request);
        return isUpdated ? ResponseEntity.ok("Restaurant updated successfully") : ResponseEntity.status(400).body("Failed to update restaurant");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRestaurant(@PathVariable int id) {
        boolean isDeleted = restaurantService.deleteRestaurant(id);
        return isDeleted ? ResponseEntity.ok("Restaurant deleted successfully") : ResponseEntity.status(400).body("Failed to delete restaurant");
    }
}
