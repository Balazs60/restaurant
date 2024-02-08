package com.github.balazs60.restaurant.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class OrderItemDto {
    private int quantity;
    private UUID itemId;
    private String instructions;


}
