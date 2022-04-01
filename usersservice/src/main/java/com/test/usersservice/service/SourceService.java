package com.test.usersservice.service;

import java.util.List;

import com.test.usersservice.model.Source;

public interface SourceService {

	public List<Source> getAll();
	public Source addSource(Source s);
}
