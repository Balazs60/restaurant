package com.github.balazs60.restaurant.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String description;
    private int price;
}
