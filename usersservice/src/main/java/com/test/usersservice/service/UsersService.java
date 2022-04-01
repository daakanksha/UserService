package com.test.usersservice.service;

import java.util.List;
import java.util.Optional;

import com.test.usersservice.model.OrdersDpo;
import com.test.usersservice.model.RestaurantDpo;
import com.test.usersservice.model.Users;

public interface UsersService {
	public List<Users> getUsers();
	public Users addUser(Users u);
	public Optional<Users>  findById(String id);
	public List<OrdersDpo> getOrdersByUser(String userid);
	public List<RestaurantDpo> getAllRestaurant();
}
