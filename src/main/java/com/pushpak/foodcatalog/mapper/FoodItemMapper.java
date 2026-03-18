package com.pushpak.foodcatalog.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.pushpak.foodcatalog.dto.FoodItemRequestDto;
import com.pushpak.foodcatalog.dto.FoodItemResponseDto;
import com.pushpak.foodcatalog.entity.FoodItemEntity;

@Mapper(componentModel = "spring")
public interface FoodItemMapper {
    FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);

    FoodItemEntity mapFoodItemResponseDtoToFoodItemEntity(FoodItemResponseDto foodItemResponseDTO);
    FoodItemResponseDto mapFoodItemEntityToFoodItemResponseDto(FoodItemEntity foodItemEntity);
    FoodItemEntity mapFoodItemRequestDtoToFoodItemEntity(FoodItemRequestDto foodItemRequestDTO);
}
