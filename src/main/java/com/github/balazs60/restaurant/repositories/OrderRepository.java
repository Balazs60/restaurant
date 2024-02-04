package com.github.balazs60.restaurant.repositories;

import com.github.balazs60.restaurant.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {

    @Query("SELECT o FROM Order o WHERE o.restaurantId = :restaurantId")
    List<Order> findOrdersByRestaurantId(@Param("restaurantId") UUID restaurantId);
}
