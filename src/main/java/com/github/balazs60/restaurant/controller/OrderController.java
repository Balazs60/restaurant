package com.github.balazs60.restaurant.controller;

import com.github.balazs60.restaurant.dto.OrderDto;
import com.github.balazs60.restaurant.dto.OrderItemDto;
import com.github.balazs60.restaurant.dto.OrderStatusDto;
import com.github.balazs60.restaurant.model.Order;
import com.github.balazs60.restaurant.model.OrderItem;
import com.github.balazs60.restaurant.model.OrderStatus;
import com.github.balazs60.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public List<Order> getOrders(@RequestParam("id") String id) {
        return orderService.getAllOrdersByRestaurantId(UUID.fromString(id));
    }

    @PatchMapping("/{id}")
    public void updateOrderStatus(@PathVariable String id, @RequestBody OrderStatusDto orderStatusDto) {
        UUID orderId = UUID.fromString(id);
        OrderStatus newStatus = OrderStatus.valueOf(orderStatusDto.getOrderStatus());
        orderService.updateOrderStatus(orderId, newStatus);
    }

    @PostMapping("/")
    public void addNewOrder(@RequestBody OrderDto orderDto) {
        List<OrderItem> orderItemList = new ArrayList<>();

        for (OrderItemDto orderItemDto : orderDto.getOrderItemList()) {

            OrderItem orderItem = new OrderItem(
                  null,
                    null,
                    orderItemDto.getQuantity(),
                    orderItemDto.getItemId(),
                    orderItemDto.getInstructions()
                    );
            orderItemList.add(orderItem);
        }
        orderService.addOrder(orderDto.getCustomerId(), orderDto.getRestaurantId(), orderItemList);
    }
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable String id) {
        return orderService.getOrderById(UUID.fromString(id));
    }
}
