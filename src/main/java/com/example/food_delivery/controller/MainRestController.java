package com.example.food_delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.food_delivery.dao.EmployeeDAO;
import com.example.food_delivery.dao.RestaurantDAO;
import com.example.food_delivery.model.Employee;
import com.example.food_delivery.model.Response;
import com.example.food_delivery.model.Restaurant;

@RestController
public class MainRestController {
	@Autowired
	private EmployeeDAO employeeDAO;

	@Autowired
	private RestaurantDAO restaurantDAO;

	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Welcome to my shit";
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
	@ResponseBody
	public Response getRestaurants() {
		try {
			List<Restaurant> restaurants = restaurantDAO.getAllRestaurants();
			return new Response(200, "success", true, (Object) restaurants);
		} catch (Exception ex) {
			return new Response(503, "fail", false, "cac");
		}
	}

}
