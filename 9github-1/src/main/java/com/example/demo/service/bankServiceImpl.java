package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.bankMapper;

@Service
public class bankServiceImpl implements bankService{

	@Autowired
	private bankMapper bm;
	
	@Transactional(rollbackFor = {Exception.class})
	@Override
	public void transfer(Integer fromId, Integer toId, Integer money) {
		bm.decreaseMoney(fromId, money);
		//int x=10/0;
		bm.addMoney(toId, money);
		
	}

}