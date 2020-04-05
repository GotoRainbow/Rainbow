package com.zy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zy.entity.Userinfo;

public interface UserMapper {
	
	@Select("select * from userinfo")
	public List<Userinfo> findAll();
}
