package com.example.food_delivery.model;

import java.util.Date;
import java.util.List;

public class Restaurant {
    private String name;
    private String address;
    private List<String> images;
    private String phone;
    private Date timeClose;
    private Date timeOpen;
    private String description;
    private String wifi;
    private String province;

    public Restaurant(String name, String address, List<String> images) {
        this.name = name;
        this.address = address;
        this.images = images;
    }

    public Restaurant(String name, String address, List<String> images, String phone, Date timeClose, Date timeOpen,
            String description, String wifi, String province) {
        this.name = name;
        this.address = address;
        this.images = images;
        this.phone = phone;
        this.timeClose = timeClose;
        this.timeOpen = timeOpen;
        this.description = description;
        this.wifi = wifi;
        this.province = province;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(Date timeClose) {
        this.timeClose = timeClose;
    }

    public Date getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(Date timeOpen) {
        this.timeOpen = timeOpen;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

}