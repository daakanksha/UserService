package com.test.usersservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.usersservice.model.RestaurantDpo;
import com.test.usersservice.model.Users;
import com.test.usersservice.service.UsersService;

@RestController
@RequestMapping("users")
public class UsersController {

	@Autowired
	UsersService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Users>> getAll(){
		return new ResponseEntity(service.getUsers(),HttpStatus.OK);
	}
	
	@GetMapping("restaurants")
	public ResponseEntity<List<RestaurantDpo>> getAllRestaurant(){
		return new ResponseEntity(service.getAllRestaurant(),HttpStatus.OK);
	}
	
	@PostMapping("add")
	public Users addRestaurant(@RequestBody Users u){
		
		return service.addUser(u);
	}
	
	@GetMapping("search/userid/{id}")
	public Optional<Users> findRestaurants(@PathVariable(name="id") String id){
		
		return service.findById(id);
	}
	
	@GetMapping("search/order/{userid}")
	public ResponseEntity<List<Users>> getOrders(@PathVariable(name="userid") String userid){
		return new ResponseEntity(service.getOrdersByUser(userid),HttpStatus.OK);
	}
}
