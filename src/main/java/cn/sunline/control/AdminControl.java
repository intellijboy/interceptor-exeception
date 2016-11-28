/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.controlMyControl.java
 * 作  者：刘卜铷
 * 日  期：2016年11月25日 下午4:52:17
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sunline.entity.Admin;

@Controller
@RequestMapping("admin")
public class AdminControl {

	/**
	 * 将会被拦截器拦截处理
	 * @author 刘卜铷
	 * @date 2016年11月25日 下午5:25:09
	 * @return
	 */
	@RequestMapping("index")
	public String toIndexPage(){
		return "admin/index";
	}
	
	
	@RequestMapping("user_manager")
	public String toUserMangerPage(){
		return "admin/user_manager";
	}
	
	@RequestMapping("login")
	public String adminLogin(Admin admin,HttpServletRequest request){
		request.getSession().setAttribute("admin", admin);
		return "redirect:/admin/index";
	}
	
	@RequestMapping("exit")
	public String adminExit(HttpServletRequest request){
		request.getSession().removeAttribute("admin");
		request.getSession().getAttribute("admin");
		return "redirect:/admin_login.jsp";
	}
	
	
	
}
