package com.test.usersservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	@Id
	String  userid;
	String password;
	String mail;
	String name;
	String role;
	
	public Users(String userid, String password, String mail, String name, String role) {
		super();
		this.userid = userid;
		this.password = password;
		this.mail = mail;
		this.name = name;
		this.role = role;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
