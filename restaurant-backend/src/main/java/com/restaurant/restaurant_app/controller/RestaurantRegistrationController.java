package com.restaurant.restaurant_app.controller;

import com.restaurant.restaurant_app.model.RestaurantRequest;
import com.restaurant.restaurant_app.service.RestaurantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restro/register")
public class RestaurantRegistrationController {

    private final RestaurantService restaurantService;

    public RestaurantRegistrationController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> registerRestaurant(@RequestBody RestaurantRequest restaurantRequest) {
        restaurantService.addRestaurant(restaurantRequest);
        return new ResponseEntity<>("Restro Name is " + restaurantRequest.getRestroName() + " and city is " + restaurantRequest.getCity(), HttpStatus.OK);
    }
}
