package com.example.food_delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.food_delivery.dao.EmployeeDAO;
import com.example.food_delivery.model.Employee;

@RestController
public class MainRestController {
	@Autowired
	private EmployeeDAO employeeDAO;

	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Welcome to my shit";
	}

	// URL:
	// http://localhost:8080/employees
	@RequestMapping(//
			value = "/employees", //
			method = RequestMethod.GET, //
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Employee> getEmployees() {
		List<Employee> list = employeeDAO.getAllEmployees();
		return list;
	}
}
