package com.example.food_delivery.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.food_delivery.model.Food;

import org.springframework.stereotype.Repository;

@Repository
public class FoodDAO {
    private static List<Food> foods = new ArrayList<Food>();

    static {
        initRestautants();
    }

    static void initRestautants() {

    }
}