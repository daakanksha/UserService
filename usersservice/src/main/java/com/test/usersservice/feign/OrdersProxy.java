package com.test.usersservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.test.usersservice.model.OrdersDpo;

@FeignClient(name="ORDERS-SERVICE")
public interface OrdersProxy {
	
	@GetMapping("orders/search/userid/{userid}")
	public List<OrdersDpo> searchByUserId(@PathVariable(name="userid") String userid);
}
