package com.github.balazs60.restaurant.dao;

import com.github.balazs60.restaurant.model.*;
import com.github.balazs60.restaurant.repositories.OrderRepository;
import com.github.balazs60.restaurant.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class OrderDaoImpl implements OrderDao {

    private OrderRepository orderRepository;


    @Autowired
    public OrderDaoImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void addOrder(UUID customerId, UUID restaurantId, List<OrderItem> orderItems) {
        Order order = new Order();
        order.setOrderItems(orderItems);
        order.setOrderStatus(OrderStatus.RECEIVED);
        order.setCustomerId(customerId);
        order.setRestaurantId(restaurantId);
        orderRepository.save(order);

    }

    @Override
    public List<Order> getAllOrder(UUID restaurantId) {
        return orderRepository.findOrdersByRestaurantId(restaurantId);
    }


    @Override
    public void updateOrderStatus(UUID orderId, OrderStatus newStatus) {
        Order order = orderRepository.findById(orderId).get();
        order.setOrderStatus(newStatus);
        orderRepository.save(order);
    }

    @Override
    public Order getOrderById(UUID orderId) {
        return orderRepository.findById(orderId).get();
    }
}