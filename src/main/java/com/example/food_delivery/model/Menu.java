package com.example.food_delivery.model;

public class Menu {
    private int id;
    private String name;
    private String slug;
    private String query;

    public Menu(int id, String name, String slug, String query) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.query = query;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

}