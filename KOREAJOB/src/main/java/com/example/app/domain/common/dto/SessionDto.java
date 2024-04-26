package com.example.app.domain.common.dto;
import java.io.Serializable;

public class SessionDto  implements Serializable{
	private static final long serialVersionUID = 4L;

	
	private String  sessionId;
	private String username;
	private String role;
	//toString
	//getter and setter
	//생성자(디폴트,모든인자)
	@Override
	public String toString() {
		return "SessionDto [sessionId=" + sessionId + ", username=" + username + ", role=" + role + "]";
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public SessionDto(String sessionId, String username, String role) {
		super();
		this.sessionId = sessionId;
		this.username = username;
		this.role = role;
	}
	public SessionDto() {}
	
	
}
