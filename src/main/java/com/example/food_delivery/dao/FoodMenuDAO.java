package com.example.food_delivery.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.food_delivery.model.Food;
import com.example.food_delivery.model.FoodMenu;
import com.example.food_delivery.model.Menu;

import org.springframework.stereotype.Repository;

@Repository
public class FoodMenuDAO {
    private static List<FoodMenu> foodMenus = new ArrayList<FoodMenu>();

    static {
        initRestautants();
    }

    // public Menu(int id, String name, String slug, String query) {
    // this.id = id;
    // this.name = name;
    // this.slug = slug;
    // this.query = query;
    // }
    static void initRestautants() {
        Food food1 = new Food(1, "Bun dau co Chang", "bun-dau-co-chang");
        Food food2 = new Food(2, "Bun dau co Chang", "bun-dau-co-chang");
        Food food3 = new Food(3, "Bun dau co Chang", "bun-dau-co-chang");
        Menu menu = new Menu(1, "Những ngày đẹp trời Menu", "nhung-ngay-dep-troi", "temp-query");
        FoodMenu foodMenu1 = new FoodMenu(1, food1, menu, 15000,
                "https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg");
        FoodMenu foodMenu2 = new FoodMenu(2, food2, menu, 20000,
                "https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg");
        FoodMenu foodMenu3 = new FoodMenu(3, food3, menu, 25000,
                "https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg");

        foodMenus.add(foodMenu1);
        foodMenus.add(foodMenu2);
        foodMenus.add(foodMenu3);
    }

    public List<FoodMenu> getFoodsByMenu() {
        List<FoodMenu> foodMenusTemp = new ArrayList<FoodMenu>();
        foodMenusTemp = foodMenus;
        return foodMenusTemp;
    }

}