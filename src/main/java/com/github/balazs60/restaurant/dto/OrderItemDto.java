package com.github.balazs60.restaurant.dto;

import java.util.UUID;

public class OrderItemDto {
    private int quantity;
    private UUID itemId;
    private String instructions;

    public int getQuantity() {
        return quantity;
    }

    public UUID getItemId() {
        return itemId;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setItemId(UUID itemId) {
        this.itemId = itemId;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
