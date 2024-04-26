package com.example.app.domain.seeker.dto;

import java.util.List;

import com.example.app.domain.common.dto.UserDto;

public class SeekerDto extends UserDto {
	
	private String address;
	private String tel;
	private String ability;	//최종학력
	//private List<String> carrer;	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAbility() {
		return ability;
	}
	public void setAbility(String ability) {
		this.ability = ability;
	}
	public static int check(String id, String password) {
		return 0;
	}
	
	
}
