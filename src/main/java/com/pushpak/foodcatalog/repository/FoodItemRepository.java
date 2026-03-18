package com.pushpak.foodcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pushpak.foodcatalog.entity.FoodItemEntity;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItemEntity, Long> {

}
