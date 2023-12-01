package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.mapper.bankMapper;

public interface bankService {
	
	void transfer(Integer fromId,Integer toId,Integer money);

}