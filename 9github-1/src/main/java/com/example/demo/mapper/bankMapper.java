package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface bankMapper {
	//甲方扣錢
	@Update("update bank set balance=balance-#{money} where id=#{id}")
	void decreaseMoney(Integer id,Integer money);
	//乙方加錢
	@Update("update bank set balance=balance+#{money} where id=#{id}")
	void addMoney(Integer id,Integer money);

}