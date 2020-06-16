package com.example.food_delivery.model;

public class Food {
    private int id;
    private String name;
    private double price;
    private String slug;

    public Food(int id, String name, double price, String slug) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

}