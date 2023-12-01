package com.example.demo.vo;

import lombok.Data;

@Data
public class bank {
	private Integer id;
	private String name;
	private Integer balance;
	
	public bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public bank(String name, Integer balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	

}