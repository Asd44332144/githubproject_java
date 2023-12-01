package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.bankServiceImpl;

@RestController
public class bankController {
	@Autowired
	bankServiceImpl bs;
	
	@PostMapping("transfer")
	public String transfer(Integer fromId,Integer toId,Integer money)
	{
		
		bs.transfer(fromId, toId, money);
		
		return "交易成功";
	}

}