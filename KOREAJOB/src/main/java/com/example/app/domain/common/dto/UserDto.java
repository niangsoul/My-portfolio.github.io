package com.example.app.domain.common.dto;

import com.example.app.type.ROLE;

public class UserDto {
	private String id;
	private String password;
	private String username;
	private ROLE role;
	
	private boolean islocked;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ROLE getRole() {
		return role;
	}

	public void setRole(ROLE role) {
		this.role = role;
	}

	public boolean isIslocked() {
		return islocked;
	}

	public void setIslocked(boolean islocked) {
		this.islocked = islocked;
	}
	
	
	
}
