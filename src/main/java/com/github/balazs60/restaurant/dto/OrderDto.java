package com.github.balazs60.restaurant.dto;

import com.github.balazs60.restaurant.model.OrderItem;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class OrderDto {
   private UUID customerId;
   private UUID restaurantId;
   private List<OrderItemDto> orderItemList;


}
