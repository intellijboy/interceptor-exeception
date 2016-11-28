/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.interceptorUserInterceptor.java
 * 作  者：刘卜铷
 * 日  期：2016年11月28日 下午2:21:05
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.sunline.enums.EroEnum;

public class UserPageInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Object user =request.getSession().getAttribute("user");
		if(user!=null){
			return true;
		}
		String contextPath = request.getServletContext().getContextPath();
		response.sendRedirect(contextPath+"/user_login.jsp?detail_msg="+EroEnum.NO_ABILITY_ACCESS);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
