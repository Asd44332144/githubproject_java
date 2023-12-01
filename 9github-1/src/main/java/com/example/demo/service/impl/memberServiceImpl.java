package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.memberMapper;
import com.example.demo.service.memberService;
import com.example.demo.vo.member;
@Service
public class memberServiceImpl implements memberService{
	@Autowired
	memberMapper mp;
	
	@Override
	public member Login(String username, String password) {
		
		
		return mp.queryMember(username, password);
	}

	@Override
	public boolean userNamerRepeat(String username) {
		member m=mp.queryUsername(username);
		boolean x=false;
		if(m!=null) x=true;
		return x;
	}

	@Override
	public void addMember(member m) {
		mp.add(m);
		
	}

}