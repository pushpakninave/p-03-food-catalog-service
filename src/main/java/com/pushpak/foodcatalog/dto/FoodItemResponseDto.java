package com.pushpak.foodcatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItemResponseDto {
    private String name;
    private String description;
    private Number price;
    private Long restaurantId;
    private Boolean isVeg;
    private Integer quantity;
}
 