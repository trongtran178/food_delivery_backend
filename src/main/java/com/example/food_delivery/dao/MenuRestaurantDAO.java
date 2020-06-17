package com.example.food_delivery.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.example.food_delivery.model.Menu;
import com.example.food_delivery.model.MenuRestaurant;
import com.example.food_delivery.model.Restaurant;

import org.springframework.stereotype.Repository;

@Repository
public class MenuRestaurantDAO {

    private static List<MenuRestaurant> menuRestaurantList = new ArrayList<MenuRestaurant>();

    static {
        initMenuRestautants();
    }

    private static void initMenuRestautants() {
        List<String> fakeImages = new ArrayList<String>();
        fakeImages.add("https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg");
        fakeImages.add("https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595129/restaurant_1_pnynjn.jpg");
        fakeImages.add("https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595130/restaurant_2_xar8om.jpg");
        fakeImages.add("https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595130/restaurant_4_qftatg.jpg");

        Calendar timeOpenCalendar = Calendar.getInstance();
        Calendar timeCloseCalendar = Calendar.getInstance();
        timeOpenCalendar.setTimeZone(TimeZone.getTimeZone("248")); // 248 - Asia/Bangkok Timezone ID
        timeCloseCalendar.setTimeZone(TimeZone.getTimeZone("248")); // 248 - Asia/Bangkok Timezone ID
        timeOpenCalendar.set(1900, 0, 1, 7, 0, 0);
        timeCloseCalendar.set(1900, 0, 1, 23, 0, 0);
        Date timeOpen = timeOpenCalendar.getTime();
        Date timeClose = timeCloseCalendar.getTime();

        Restaurant restaurant = new Restaurant(2, "Quán Ông Tiên - Chi Nhánh 1", //
                "225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
                "0938277668", //
                timeOpen, //
                timeClose, //
                "Bình dân - Phù hợp khi đi theo nhóm - Bia", //
                "TP.HCM", //
                "https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
                fakeImages, //
                "temp wifi", 10.843972, 106.767511);

        Menu menu = new Menu(1, "Những ngày đẹp trời menu", "nhung-ngay-dep-troi", "temp-query");

        MenuRestaurant menuRestaurant = new MenuRestaurant(1, restaurant, menu);

        menuRestaurantList.add(menuRestaurant);

    }

    public List<MenuRestaurant> getAllMenuRestaurant() {
        List<MenuRestaurant> menuRestaurantListTemp = new ArrayList<MenuRestaurant>();
        menuRestaurantListTemp = menuRestaurantList;
        return menuRestaurantListTemp;
    }
}