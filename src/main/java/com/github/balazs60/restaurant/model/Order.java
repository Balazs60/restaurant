package com.github.balazs60.restaurant.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue
    private UUID id;
    private UUID customerId;
    private UUID restaurantId;
    private OrderStatus orderStatus;
    @OneToMany(mappedBy = "member")
    private List<Item> items;
}
