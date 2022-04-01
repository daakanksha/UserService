package com.test.usersservice.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.mapping.List;

@Entity
@Table(name="source")
public class Source {

	@Id
	int id;
	List item;
	public Source(int id, List item) {
		super();
		this.id = id;
		this.item = item;
	}
	public Source() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List getItem() {
		return item;
	}
	public void setItem(List item) {
		this.item = item;
	}
	
	
	
}


