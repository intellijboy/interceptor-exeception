/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.interceptorAdminLoginInterceptor.java
 * 作  者：刘卜铷
 * 日  期：2016年11月28日 下午2:42:52
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.sunline.enums.EroEnum;

public class AdminLoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("AdminLoginFilter init....");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse =  (HttpServletResponse) response;
		if(servletRequest.getSession().getAttribute("admin")!=null){
			String contextPath = request.getServletContext().getContextPath();
			servletResponse.sendRedirect(contextPath+"/admin/index");
			chain.doFilter(request, response);
		}
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("AdminLoginFilter destroy....");
		
	}
	
}
