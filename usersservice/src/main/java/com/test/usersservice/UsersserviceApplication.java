package com.test.usersservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.test.usersservice")
public class UsersserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersserviceApplication.class, args);
	}

}
