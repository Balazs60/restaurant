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
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String email;
}
