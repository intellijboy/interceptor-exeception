/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.exceptionPageNotFoundException.java
 * 作  者：刘卜铷
 * 日  期：2016年11月28日 下午7:05:46
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.exception;
/**
 * 页面不存在异常
 * @author 刘卜铷
 * @date 2016年11月28日 下午7:06:53
 */
public class PageNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4843139061520380051L;

	public PageNotFoundException() {
		super();
	}

	public PageNotFoundException(String message) {
		super(message);
	}
}
