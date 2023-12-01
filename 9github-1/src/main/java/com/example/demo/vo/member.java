package com.example.demo.vo;

import lombok.Data;

@Data
public class member {
	private Integer id;
	private String username;
	private String password;
	private String name;
	private String address;
	private String phone;
	private String mobile;
	public member( String username, String password, String name, String address, String phone,
			String mobile) {
		super();
		
		this.username = username;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
	}
	public member() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}