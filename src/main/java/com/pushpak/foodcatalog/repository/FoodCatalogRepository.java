package com.pushpak.foodcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pushpak.foodcatalog.entity.FoodCatalogEntity;

@Repository
public interface FoodCatalogRepository extends JpaRepository<FoodCatalogEntity, Long> {

}
