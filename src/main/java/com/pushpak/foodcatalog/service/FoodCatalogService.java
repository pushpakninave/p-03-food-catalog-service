package com.pushpak.foodcatalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pushpak.foodcatalog.repository.FoodCatalogRepository;

@Service
public class FoodCatalogService {
    @Autowired
    private FoodCatalogRepository foodCatalogRepository;
}
