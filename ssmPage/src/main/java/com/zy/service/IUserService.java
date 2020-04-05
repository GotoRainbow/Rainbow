package com.zy.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zy.entity.Userinfo;

public interface IUserService {
	/**
	 * 
	 * @param pageNum 当前页数
	 * @param pageSize 一页显示多少个
	 * @return  PageInfo  total pageNum  pageSize countPage  List<Userinfo> list
	 */
	PageInfo<Userinfo> findAllPage(Integer pageNum,Integer pageSize);
}
