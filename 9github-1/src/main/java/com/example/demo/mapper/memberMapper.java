package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.member;

@Mapper
public interface memberMapper {
	//create
	@Insert("insert into member(username,password,name,address,phone,mobile) "
			+ "values(#{username},#{password},#{name},#{address},#{phone},#{mobile})")
	void add(member m);
	
	
	//read
	@Select("select * from member where "
			+ "username=#{username} and password=#{password}")
	member queryMember(String username,String password);
	
	@Select("select * from member")
	List<member> query();
	
	@Select("select * from member where username=#{username}")
	member queryUsername(String username);
	
	@Select("select * from member where id=#{id}")
	member queryId(int id);
	
	//update
	
	@Update("update member set name=#{name},password=#{password},phone=#{phone},address=#{address} where id=#{id}")
	void update(member m);
		
	//delete
	@Delete("delete from member where id=#{id}")
	void delete(int id);

	
}