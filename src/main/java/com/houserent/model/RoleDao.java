package com.houserent.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoleDao {
	@Id
	private int id;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
