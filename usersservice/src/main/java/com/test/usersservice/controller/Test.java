package com.test.usersservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.usersservice.model.Source;
import com.test.usersservice.service.SourceService;

@RestController
@RequestMapping("test")
public class Test {
	
	@Autowired
	SourceService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Source>> getAll(){
		return new ResponseEntity(service.getAll(),HttpStatus.OK);
	}
	
	@PostMapping("add")
	public Source addSource(@RequestBody Source s) {
		return service.addSource(s);
	}

}
