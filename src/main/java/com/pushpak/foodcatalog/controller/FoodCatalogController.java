package com.pushpak.foodcatalog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pushpak.foodcatalog.dto.FoodItemRequestDto;
import com.pushpak.foodcatalog.dto.FoodItemResponseDto;
import com.pushpak.foodcatalog.entity.FoodItemEntity;
import com.pushpak.foodcatalog.mapper.FoodItemMapper;
import com.pushpak.foodcatalog.service.FoodCatalogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/food-catalog")
public class FoodCatalogController {
    @Autowired
    private FoodCatalogService foodCatalogService;

    @PostMapping("/")
    public ResponseEntity<FoodItemResponseDto> addFoodItem(@RequestBody FoodItemRequestDto foodItem) {
        return ResponseEntity.status(HttpStatus.CREATED).body(foodCatalogService.addFoodItem(foodItem));
    }

    @GetMapping("/")
    public ResponseEntity<List<FoodItemResponseDto>> getFoodAllItems() {
        return ResponseEntity.ok(foodCatalogService.getAllFoodItems());
    }

    @GetMapping("/{id}")
    public Optional<FoodItemResponseDto> getFoodItemById(@RequestParam Long id) {
        return Optional.ofNullable(foodCatalogService.getFoodItemById(id)
                .orElseThrow(() -> new RuntimeException("Food item not found")));
    }

}
