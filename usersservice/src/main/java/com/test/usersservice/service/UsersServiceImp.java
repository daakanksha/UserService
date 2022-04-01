package com.test.usersservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.usersservice.dao.UsersDao;
import com.test.usersservice.feign.OrdersProxy;
import com.test.usersservice.feign.RestaurantProxy;
import com.test.usersservice.model.OrdersDpo;
import com.test.usersservice.model.RestaurantDpo;
import com.test.usersservice.model.Users;

@Service
public class UsersServiceImp implements UsersService{
	
	@Autowired
	UsersDao dao;
	
	@Autowired
	OrdersProxy proxy;
	
	@Autowired
	RestaurantProxy rproxy;

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Users addUser(Users u) {
		// TODO Auto-generated method stub
		return dao.save(u);
	}

	@Override
	public Optional<Users> findById(String id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<OrdersDpo> getOrdersByUser(String userid) {
		// TODO Auto-generated method stub
		return (List<OrdersDpo>) proxy.searchByUserId(userid);
	}

	@Override
	public List<RestaurantDpo> getAllRestaurant() {
		// TODO Auto-generated method stub
		return (List<RestaurantDpo>) rproxy.getAll();
	}

	

}
