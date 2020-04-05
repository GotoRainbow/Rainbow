package com.zy.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用来处理全局异常
 */
public class MyExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ModelAndView mav = new ModelAndView();
		String msg = "";
		//判断异常是否是一个自定义异常
		if(ex instanceof MyException){
			//如果是一个自定义异常，直接获取message
			msg = ex.getMessage();
		}else{
			msg = "未知错误";
		}
		//将错误信息放到  域对象中
		mav.addObject("msg", msg);
		//转发到错误页面
		mav.setViewName("/error.jsp");
		return mav;
	}

}
