package com.github.balazs60.restaurant.repositories;

import com.github.balazs60.restaurant.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {
}
