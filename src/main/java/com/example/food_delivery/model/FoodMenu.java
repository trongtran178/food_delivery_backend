package com.example.food_delivery.model;

public class FoodMenu {
    private int id;
    private Food food;
    private Menu menu;
    private double price;
    private String foodAvatarUrl;

    public FoodMenu(int id, Food food, Menu menu, double price, String foodAvatarUrl) {
        this.id = id;
        this.food = food;
        this.menu = menu;
        this.price = price;
        this.foodAvatarUrl = foodAvatarUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFoodAvatarUrl() {
        return foodAvatarUrl;
    }

    public void setFoodAvatarUrl(String foodAvatarUrl) {
        this.foodAvatarUrl = foodAvatarUrl;
    }

}