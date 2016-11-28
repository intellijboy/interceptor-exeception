/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.exeception.controlSpringMVCExceptionControl.java
 * 作  者：刘卜铷
 * 日  期：2016年11月28日 下午8:07:28
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.exeception.control;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import cn.sunline.exception.PageNotFoundException;


@ControllerAdvice
public class SpringMVCExceptionControl {
	
			@ExceptionHandler(value={PageNotFoundException.class})
			public ModelAndView hadleNoFoundPageException(Exception ex){
				ModelAndView mvAndView = new ModelAndView("error/error");
				mvAndView.addObject("ex", ex);
				return mvAndView;
			}
}
