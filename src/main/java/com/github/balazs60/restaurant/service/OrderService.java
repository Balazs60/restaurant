package com.github.balazs60.restaurant.service;

import com.github.balazs60.restaurant.dao.OrderDao;
import com.github.balazs60.restaurant.model.Item;
import com.github.balazs60.restaurant.model.Order;
import com.github.balazs60.restaurant.model.OrderItem;
import com.github.balazs60.restaurant.model.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    private OrderDao orderDao;

    @Autowired
    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void addOrder(UUID customerId, UUID restaurantId, List<OrderItem> orderItems) {

        orderDao.addOrder(customerId,restaurantId,orderItems);
    }

    public List<Order> getAllOrdersByRestaurantId(UUID restaurantId) {
        return orderDao.getAllOrder(restaurantId);
    }

    public void updateOrderStatus(UUID orderId, OrderStatus newStatus) {
        orderDao.updateOrderStatus(orderId, newStatus);
    }

    public Order getOrderById(UUID orderId) {
        return orderDao.getOrderById(orderId);
    }
}
