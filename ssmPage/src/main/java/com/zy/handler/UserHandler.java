package com.zy.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zy.entity.Userinfo;
import com.zy.service.IUserService;

@Controller
public class UserHandler {
	@Autowired
	private IUserService userServiceImpl;
	
	@RequestMapping("/getUserPage.action")
	@ResponseBody
	public PageInfo<Userinfo> ajaxFindPage(Integer pageNum, Integer pageSize){
		return userServiceImpl.findAllPage(pageNum, pageSize);
	}
	
	@RequestMapping("/getUserPage2.action")
	public String ajaxFindPage2(Model model,Integer pageNum, Integer pageSize){
		PageInfo<Userinfo> pageinfo = userServiceImpl.findAllPage(pageNum, pageSize);
		model.addAttribute("pageinfo", pageinfo);
		return "/show.jsp";
	}
}
