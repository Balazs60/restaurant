package com.github.balazs60.restaurant.dto;

import lombok.*;

import java.util.UUID;
@Getter
@Setter
//@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDto {
    private UUID id;
    private String name;
}
