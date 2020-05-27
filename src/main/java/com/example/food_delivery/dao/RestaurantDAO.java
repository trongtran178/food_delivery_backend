package com.example.food_delivery.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.food_delivery.model.Restaurant;

import org.springframework.stereotype.Repository;

@Repository
public class RestaurantDAO {

	private static List<Restaurant> restaurants = new ArrayList<Restaurant>();

	static {
		initRestautants();
	}

	private static void initRestautants() {
		List<String> fakeImages = new ArrayList<String>();
		fakeImages.add("https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg");
		fakeImages.add("https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595129/restaurant_1_pnynjn.jpg");
		fakeImages.add("https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595130/restaurant_2_xar8om.jpg");
		fakeImages.add("https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595130/restaurant_4_qftatg.jpg");
		restaurants.add(new Restaurant("Mr Beer steak & ribs",
				"56-58 Bùi Thị Xuân, Phường Phạm Ngũ Lão, Quận 1, Hồ Chí Minh", fakeImages));

		restaurants.add(new Restaurant("Bun bo hue co Cuc", "40/13 Nguyễn Văn Đậu, Phường 6, Bình Thạnh, Hồ Chí Minh",
				fakeImages));

		restaurants.add(new Restaurant("Top Of The Town Restaurant",
				"Khách sạn Windsor Plaza Hotel, Tầng 25, 18 An Dương Vương, Phường 9, Quận 5, Hồ Chí Minh 67337",
				fakeImages));

		restaurants.add(new Restaurant("R&J Italian Lounge & Restaurant",
				"The Reverie Saigon (level B1), 22-36 Nguyen Hue Boulevard, Ben Nghe Ward, District 1, Hồ Chí Minh",
				fakeImages));
	}

	public List<Restaurant> getAllRestaurants() {
		List<Restaurant> AllRestaurants = new ArrayList<Restaurant>();
		AllRestaurants.addAll(restaurants);
		return AllRestaurants;
	}

}
