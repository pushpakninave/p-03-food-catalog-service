package com.pushpak.foodcatalog.mapper;

import org.mapstruct.Mapper;

import com.pushpak.foodcatalog.dto.FoodItemRequestDto;
import com.pushpak.foodcatalog.dto.FoodItemResponseDto;
import com.pushpak.foodcatalog.entity.FoodItemEntity;

@Mapper(componentModel = "spring")
public interface FoodItemMapper {
    FoodItemEntity mapFoodItemResponseDtoToFoodItemEntity(FoodItemResponseDto foodItemResponseDTO);
    FoodItemResponseDto mapFoodItemEntityToFoodItemResponseDto(FoodItemEntity foodItemEntity);
    FoodItemEntity mapFoodItemRequestDtoToFoodItemEntity(FoodItemRequestDto foodItemRequestDTO);
}
