package com.github.balazs60.restaurant.dto;

import com.github.balazs60.restaurant.model.OrderItem;

import java.util.List;
import java.util.UUID;

public class OrderDto {
   private UUID customerId;
   private UUID restaurantId;
   private List<OrderItemDto> orderItemList;

    public UUID getCustomerId() {
        return customerId;
    }

    public UUID getRestaurantId() {
        return restaurantId;
    }

    public List<OrderItemDto> getOrderItemList() {
        return orderItemList;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public void setRestaurantId(UUID restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setOrderItemList(List<OrderItemDto> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
