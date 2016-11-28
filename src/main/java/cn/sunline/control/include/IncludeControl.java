/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.control.includeIncludeControl.java
 * 作  者：刘卜铷
 * 日  期：2016年11月28日 上午9:19:17
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.control.include;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("include")
public class IncludeControl {
	
	@RequestMapping("index")
	public String toIndexPage(){
		return "index";
	}

}
