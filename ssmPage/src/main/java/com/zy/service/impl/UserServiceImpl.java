package com.zy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zy.entity.Userinfo;
import com.zy.mapper.UserMapper;
import com.zy.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public PageInfo<Userinfo> findAllPage(Integer pageNum, Integer pageSize) {
		//对参数进行非空判断
		pageNum = pageNum == null ? 1 : pageNum;
		pageSize = pageSize == null ? 10 : pageSize;
		//初始化分页插件
		PageHelper.startPage(pageNum, pageSize);
		//执行查询操作   分页插件 
		//会将原有的查询所有数据操作分为  先查总行数，再查当前某一页的数据 。这两步来执行
		List<Userinfo> list = userMapper.findAll();
		PageInfo<Userinfo> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

}
