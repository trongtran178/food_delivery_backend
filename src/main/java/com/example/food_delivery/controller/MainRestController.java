package com.example.food_delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.food_delivery.dao.EmployeeDAO;
import com.example.food_delivery.dao.FoodMenuDAO;
import com.example.food_delivery.dao.MenuRestaurantDAO;
import com.example.food_delivery.dao.RestaurantDAO;
import com.example.food_delivery.model.Employee;
import com.example.food_delivery.model.FoodMenu;
import com.example.food_delivery.model.MenuRestaurant;
import com.example.food_delivery.model.Restaurant;
import com.example.food_delivery.model.api.Response;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class MainRestController {
	@Autowired
	private EmployeeDAO employeeDAO;

	@Autowired
	private RestaurantDAO restaurantDAO;

	@Autowired
	private MenuRestaurantDAO menuRestaurantDAO;

	@Autowired
	private FoodMenuDAO foodMenuDAO;

	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Welcome to my home";
	}

	@RequestMapping(//
			value = "/employees", //
			method = RequestMethod.GET, //
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Employee> getEmployees() {
		List<Employee> list = employeeDAO.getAllEmployees();
		return list;
	}

	@RequestMapping(//
			value = "/restaurants", //
			method = RequestMethod.GET, //
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody()
	public Response getRestaurants() throws JsonProcessingException {
		try {
			List<Restaurant> restaurants = restaurantDAO.getAllRestaurants();
			return new Response(200, "success", true, restaurants);
		} catch (Exception ex) {
			return new Response(503, "fail", false, "cac");
		}
	}

	@RequestMapping(//
			value = "/menu-restaurant", //
			method = RequestMethod.GET, //
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody()
	public Response getMenuRestaurants() throws JsonProcessingException {
		try {
			List<MenuRestaurant> menurRestaurants = menuRestaurantDAO.getAllMenuRestaurant();
			return new Response(200, "success", true, menurRestaurants);
		} catch (Exception ex) {
			return new Response(503, "fail", false, "cac");
		}
	}

	@RequestMapping(//
			value = "/food/menu", //
			method = RequestMethod.GET, //
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody()
	public Response getFoodByMenu() throws JsonProcessingException {
		try {
			List<FoodMenu> foodsByMenu = foodMenuDAO.getFoodsByMenu();
			return new Response(200, "success", true, foodsByMenu);
		} catch (Exception ex) {
			return new Response(503, "fail", false, "cac");
		}
	}

}
