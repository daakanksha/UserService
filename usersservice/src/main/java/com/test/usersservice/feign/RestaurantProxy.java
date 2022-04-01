package com.test.usersservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.test.usersservice.model.RestaurantDpo;


@FeignClient(name="RESTAURANT-SERVICE")
public interface RestaurantProxy {

	@GetMapping("restaurant/all")
	public List<RestaurantDpo> getAll();
}
