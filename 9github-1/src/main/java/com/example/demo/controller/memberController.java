package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.mapper.memberMapper;
import com.example.demo.vo.member;

@Controller
public class memberController {
	@Autowired
	private memberMapper membermapper;
	@RequestMapping("add")
	public String add(String username,
			String password,
			String name,
			String address,
			String phone ,
			String mobile)
		{	
		member m0=membermapper.queryUsername(username);
		
		if(m0!=null) {
			return "addMemberError";
		}
		else{
		member m=new member(username,password,name,address,phone,mobile);
	
		membermapper.add(m);
		
		return "addMemberSuccess";}
		}
	@RequestMapping("Login")
	public String login(String username,String password)
	{
		member m=membermapper.queryMember(username, password);
		if(m!=null)
		{
			return "LoginSuccess";
		}
		else
		{
			return "LoginError";
		}
	}
	@RequestMapping("addMember")
	public String getToAddMember()
	{
		return "addMember";
	}

}
