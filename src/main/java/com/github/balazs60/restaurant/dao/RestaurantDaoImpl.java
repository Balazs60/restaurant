package com.github.balazs60.restaurant.dao;

import com.github.balazs60.restaurant.model.Item;
import com.github.balazs60.restaurant.model.Order;
import com.github.balazs60.restaurant.model.OrderStatus;
import com.github.balazs60.restaurant.model.Restaurant;
import com.github.balazs60.restaurant.repositories.RestaurantRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class RestaurantDaoImpl implements RestaurantDao {
private RestaurantRepository restaurantRepository;


@Autowired
    public RestaurantDaoImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant getRestaurantById(UUID restaurantId) {
        return restaurantRepository.findById(restaurantId).get();
    }

    @Override
    public List<Item> getMenuByRestaurantId(UUID restaurantId) {
        return restaurantRepository.findById(restaurantId).get().getMenu();
    }
}
