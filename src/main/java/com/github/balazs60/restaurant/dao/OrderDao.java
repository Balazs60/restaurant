package com.github.balazs60.restaurant.dao;

import com.github.balazs60.restaurant.model.Item;
import com.github.balazs60.restaurant.model.Order;
import com.github.balazs60.restaurant.model.OrderItem;
import com.github.balazs60.restaurant.model.OrderStatus;

import java.util.List;
import java.util.UUID;

public interface OrderDao {
    public void addOrder(UUID customerId, UUID restaurantId, List<OrderItem> orderItems);
    public List<Order> getAllOrder(UUID restaurantId);
    public void updateOrderStatus(UUID orderId, OrderStatus newStatus);

    public Order getOrderById(UUID orderId);
}
