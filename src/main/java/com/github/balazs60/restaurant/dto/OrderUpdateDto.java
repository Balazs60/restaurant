package com.github.balazs60.restaurant.dto;

public class OrderUpdateDto {
    private String orderId;
    private String newStatus;

    public String getOrderId() {
        return orderId;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }
}
