package com.example.food_delivery.model;

public class MenuRestaurant {
    private int id;
    private Restaurant restaurant;
    private Menu menu;

    public MenuRestaurant(int id, Restaurant restaurant, Menu menu) {
        this.id = id;
        this.restaurant = restaurant;
        this.menu = menu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}