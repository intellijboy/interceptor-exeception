/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.interceptorAdminLoginInterceptor.java
 * 作  者：刘卜铷
 * 日  期：2016年11月28日 上午10:15:34
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.sunline.enums.EroEnum;


public class AdminPageInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("preHandle....");
	   Object admin = request.getSession().getAttribute("admin");
	   if(admin==null){
		   String contextPath = request.getServletContext().getContextPath();
		   response.sendRedirect(contextPath+"/admin_login.jsp?detail_msg="+EroEnum.NO_ABILITY_ACCESS.getState());
		   return false;
	   }
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle....");
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion....");
		
	}

}
