package com.github.balazs60.restaurant.service;

import com.github.balazs60.restaurant.dao.RestaurantDao;
import com.github.balazs60.restaurant.model.Item;
import com.github.balazs60.restaurant.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RestaurantService {

    private RestaurantDao restaurantDao;

    @Autowired
    public RestaurantService(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantDao.getAllRestaurants();
    }

    public Restaurant getRestaurantById(UUID restaurantId) {
        return restaurantDao.getRestaurantById(restaurantId);
    }
    public List<Item> getMenuByRestaurantId(UUID restaurantId){
        return restaurantDao.getMenuByRestaurantId(restaurantId);
    }
}
