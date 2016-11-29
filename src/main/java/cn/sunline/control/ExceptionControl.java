/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.controlExceptionControl.java
 * 作  者：刘卜铷
 * 日  期：2016年11月28日 下午8:13:18
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.control;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.sunline.entity.Admin;
import cn.sunline.entity.User;
import cn.sunline.exception.MyNumberException;
import cn.sunline.util.ExceptionTraceUtil;

@Controller
@RequestMapping("exception")
public class ExceptionControl {
		
	@ExceptionHandler({ RuntimeException.class })
	public ModelAndView handleException(Exception ex) {
		System.out.println("运行时异常");
		ModelAndView mv = new ModelAndView("error/error");
		mv.addObject("ex", ex);
		return mv;
	}
	
	@ExceptionHandler({ ClassCastException.class})
	public ModelAndView handleClassCastException(Exception ex) {
		System.out.println("类型转换异常");
		ModelAndView mv = new ModelAndView("error/error");
		mv.addObject("ex", ex.getMessage());
		mv.addObject("ex_trace", ExceptionTraceUtil.getTrace(ex));
		return mv;
	}
	
	@RequestMapping("error")
	public String exceptionMethod(){
		Object obj = new User();
		Admin admin = (Admin) obj;
		return "error/error";
	}
	
	@RequestMapping("xmlMapper")
	public String xmlMapperException(@RequestParam(value="p",required=false,defaultValue="100" )Integer p,Map<String,Object> map){
		if(p==100){
			throw new MyNumberException("页面找不到！！（自定义异常）");
		}
		map.put("msg", "没有发生异常，正常转向页面");
		return "success";
	}
}
