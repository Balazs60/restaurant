package com.github.balazs60.restaurant.dao;

import com.github.balazs60.restaurant.model.Item;
import com.github.balazs60.restaurant.model.Order;
import com.github.balazs60.restaurant.model.OrderStatus;
import com.github.balazs60.restaurant.model.Restaurant;

import java.util.List;
import java.util.UUID;

public interface RestaurantDao {
    public List<Restaurant> getAllRestaurants();

    public Restaurant getRestaurantById(UUID restaurantId);

    public List<Item> getMenuByRestaurantId(UUID restaurantId);
}


