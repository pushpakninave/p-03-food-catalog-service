package com.pushpak.foodcatalog.dto;

import java.util.List;

import com.pushpak.foodcatalog.entity.FoodItemEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItemResponseDto {
    private List<FoodItemEntity> foodItems;
    private RestaurantDto restaurant;
}
 