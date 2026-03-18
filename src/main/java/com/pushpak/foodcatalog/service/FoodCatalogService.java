package com.pushpak.foodcatalog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pushpak.foodcatalog.dto.FoodItemRequestDto;
import com.pushpak.foodcatalog.dto.FoodItemResponseDto;
import com.pushpak.foodcatalog.entity.FoodItemEntity;
import com.pushpak.foodcatalog.mapper.FoodItemMapper;
import com.pushpak.foodcatalog.repository.FoodItemRepository;

@Service
public class FoodCatalogService {
    @Autowired
    private FoodItemRepository foodCatalogRepository;

    public FoodItemResponseDto addFoodItem(FoodItemRequestDto entity) {
        FoodItemEntity foodItemEntity = FoodItemMapper.INSTANCE.mapFoodItemRequestDtoToFoodItemEntity(entity);
        FoodItemEntity savedFoodItem = foodCatalogRepository.save(foodItemEntity);
        return FoodItemMapper.INSTANCE.mapFoodItemEntityToFoodItemResponseDto(savedFoodItem);
    }

    public List<FoodItemResponseDto> getAllFoodItems() {
        List<FoodItemEntity> foodItems = foodCatalogRepository.findAll();
        List<FoodItemResponseDto> foodItemResponseDtos = foodItems.stream()
                .map(foodItem -> FoodItemMapper.INSTANCE.mapFoodItemEntityToFoodItemResponseDto(foodItem))
                .toList();
        return foodItemResponseDtos;
    }

    public Optional<FoodItemResponseDto> getFoodItemById(Long id) {
        FoodItemEntity foodItemEntity = foodCatalogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Food item not found"));
        return Optional.ofNullable(FoodItemMapper.INSTANCE.mapFoodItemEntityToFoodItemResponseDto(foodItemEntity));
    }
}
