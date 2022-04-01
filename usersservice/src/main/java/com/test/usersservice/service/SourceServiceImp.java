package com.test.usersservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.usersservice.dao.SourceDao;
import com.test.usersservice.model.Source;

@Service
public class SourceServiceImp implements SourceService{

	@Autowired
	SourceDao dao;
	
	@Override
	public List<Source> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Source addSource(Source s) {
		// TODO Auto-generated method stub
		return dao.save(s);
	}

}
