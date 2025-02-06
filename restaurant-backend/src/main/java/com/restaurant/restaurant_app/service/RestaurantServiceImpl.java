package com.restaurant.restaurant_app.service;

import com.restaurant.restaurant_app.entity.RestaurantDetails;
import com.restaurant.restaurant_app.model.RestaurantRequest;
import com.restaurant.restaurant_app.model.RestaurantResponse;
import com.restaurant.restaurant_app.repository.RestaurantDetailsRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantDetailsRepository restaurantDetailsRepository;

    public RestaurantServiceImpl(RestaurantDetailsRepository restaurantDetailsRepository) {
        this.restaurantDetailsRepository = restaurantDetailsRepository;
    }

    @Override
    public boolean addRestaurant(RestaurantRequest request) {
        RestaurantDetails restaurantDetails = mapDTOToEntity(request);
        RestaurantDetails persistedDetails = restaurantDetailsRepository.save(restaurantDetails);

        return !ObjectUtils.isEmpty(persistedDetails);
    }

    @Override
    public List<RestaurantResponse> getRestaurants() {
        List<RestaurantDetails> restaurantDetails = restaurantDetailsRepository.findAll();
        return mapEntityToDTO(restaurantDetails);
    }

    @Override
    public boolean updateRestaurant(int id, RestaurantRequest request) {
        if (restaurantDetailsRepository.existsById(id)) {
            RestaurantDetails updatedRestaurant = mapDTOToEntity(request);
            updatedRestaurant.setRestroId(id);
            restaurantDetailsRepository.save(updatedRestaurant);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteRestaurant(int id) {
        if (restaurantDetailsRepository.existsById(id)) {
            restaurantDetailsRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private RestaurantDetails mapDTOToEntity(RestaurantRequest restaurantRequest) {
        return RestaurantDetails.builder()
                .restroName(restaurantRequest.getRestroName())
                .restroType(restaurantRequest.getRestroType())
                .build();
    }

    private List<RestaurantResponse> mapEntityToDTO(List<RestaurantDetails> restaurantDetails) {
        List<RestaurantResponse> restaurantResponseList = new ArrayList<>();
        for (RestaurantDetails restaurant : restaurantDetails) {
            restaurantResponseList.add(
                    RestaurantResponse.builder()
                            .restroName(restaurant.getRestroName())
                            .restroType(restaurant.getRestroType())
                            .build()
            );
        }
        return restaurantResponseList;
    }
}
