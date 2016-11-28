/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.controlUserControl.java
 * 作  者：刘卜铷
 * 日  期：2016年11月28日 上午10:26:34
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.control;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.sunline.entity.User;

@Controller
@RequestMapping("user")
public class UserControl {
	
	@RequestMapping("index")
	public String toIndexPage() {
		return "user/index";
	}
	
	@RequestMapping("user_detail")
	public String toUserInfoPage() {
		return "user/user_detail";
	}
	
	@RequestMapping("login")
	public String userLogin(User user,HttpServletRequest request){
		request.getSession().setAttribute("user", user);
		return "redirect:/user/index";
	}
	
	@RequestMapping("exit")
	public String userExit(HttpServletRequest request){
		request.getSession().removeAttribute("user");
		return "redirect:/user_login.jsp";
	}
	
}
