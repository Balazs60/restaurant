package com.github.balazs60.restaurant.controller;

import com.github.balazs60.restaurant.dto.RestaurantDto;
import com.github.balazs60.restaurant.model.Item;
import com.github.balazs60.restaurant.model.Restaurant;
import com.github.balazs60.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    private RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/")
    public List<RestaurantDto> getAllRestaurants() {
        List<RestaurantDto> restaurants = restaurantService.getAllRestaurants().
                stream()
                .map(restaurant -> new RestaurantDto(
                        restaurant.getId(),
                        restaurant.getName()
                )).toList();

        return restaurants;
    }

    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable String id) {
        return restaurantService.getRestaurantById(UUID.fromString(id));
    }

    @GetMapping("/{id}/menu")
    public List<Item> getMenuByRestaurantId(@PathVariable String id) {
        return restaurantService.getMenuByRestaurantId(UUID.fromString(id));
    }

}
