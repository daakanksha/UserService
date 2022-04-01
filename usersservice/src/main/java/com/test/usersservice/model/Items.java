package com.test.usersservice.model;

class Items{
	String name;
	int quantity;
	int amount;
	public Items(String name, int quantity, int amount) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.amount = amount;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
