package com.example.food_delivery.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

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

		Calendar timeOpenCalendar = Calendar.getInstance();
		Calendar timeCloseCalendar = Calendar.getInstance();
		timeOpenCalendar.setTimeZone(TimeZone.getTimeZone("248")); // 248 - Asia/Bangkok Timezone ID
		timeCloseCalendar.setTimeZone(TimeZone.getTimeZone("248")); // 248 - Asia/Bangkok Timezone ID
		timeOpenCalendar.set(1900, 0, 1, 7, 0, 0);
		timeCloseCalendar.set(1900, 0, 1, 23, 0, 0);
		Date timeOpen = timeOpenCalendar.getTime();
		Date timeClose = timeCloseCalendar.getTime();

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("HOME Finest Saigon", //
				" 252 Điện Biên Phủ, Phường 7, Quận 3, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("HOME Finest Saigon", //
				" 252 Điện Biên Phủ, Phường 7, Quận 3, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("HOME Finest Saigon", //
				" 252 Điện Biên Phủ, Phường 7, Quận 3, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("HOME Finest Saigon", //
				" 252 Điện Biên Phủ, Phường 7, Quận 3, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("HOME Finest Saigon", //
				" 252 Điện Biên Phủ, Phường 7, Quận 3, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("HOME Finest Saigon", //
				" 252 Điện Biên Phủ, Phường 7, Quận 3, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("HOME Finest Saigon", //
				" 252 Điện Biên Phủ, Phường 7, Quận 3, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("HOME Finest Saigon", //
				" 252 Điện Biên Phủ, Phường 7, Quận 3, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("HOME Finest Saigon", //
				" 252 Điện Biên Phủ, Phường 7, Quận 3, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));

		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("HOME Finest Saigon", //
				" 252 Điện Biên Phủ, Phường 7, Quận 3, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
		restaurants.add(new Restaurant("Quán Ông Tiên - Chi Nhánh 1", //
				"225 Phạm Thế Hiển, Phường 3, Quận 8, Hồ Chí Minh", //
				"0938277668", //
				timeOpen, //
				timeClose, //
				"Bình dân - Phù hợp khi đi theo nhóm - Bia", //
				"TP.HCM", //
				"https://res.cloudinary.com/dbqpvzvem/image/upload/v1590595131/restaurant_3_joe6mq.jpg", //
				fakeImages, //
				"temp wifi", 10.843972, 106.767511));
	}

	public List<Restaurant> getAllRestaurants() {
		List<Restaurant> AllRestaurants = new ArrayList<Restaurant>();
		AllRestaurants.addAll(restaurants);
		return AllRestaurants;
	}

}
