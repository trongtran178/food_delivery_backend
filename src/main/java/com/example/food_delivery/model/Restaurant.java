package com.example.food_delivery.model;

import java.util.List;

public class Restaurant {
    private String name;
    private String address;
    private List<String> images;

    public Restaurant(String name, String address, List<String> images) {
        this.name = name;
        this.address = address;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}