package com.github.balazs60.restaurant.dao;

import com.github.balazs60.restaurant.model.Order;
import com.github.balazs60.restaurant.model.OrderItem;
import com.github.balazs60.restaurant.model.OrderStatus;

import java.util.List;
import java.util.UUID;

public interface OrderDao {
    void addOrder(UUID customerId, UUID restaurantId, List<OrderItem> orderItems);

    List<Order> getAllOrder(UUID restaurantId);

    void updateOrderStatus(UUID orderId, OrderStatus newStatus);

    Order getOrderById(UUID orderId);
}
