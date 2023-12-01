package com.example.demo.service;

import com.example.demo.vo.member;

public interface memberDao {
	void add(member m);
	member queryMember(String username,String password);
	boolean queryUsername(String username);
}
