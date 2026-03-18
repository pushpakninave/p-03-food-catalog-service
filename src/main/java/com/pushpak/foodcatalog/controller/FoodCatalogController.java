package com.pushpak.foodcatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pushpak.foodcatalog.service.FoodCatalogService;

@RestController
@RequestMapping("/food-catalog")
public class FoodCatalogController {
    @Autowired
    private FoodCatalogService foodCatalogService;
}
