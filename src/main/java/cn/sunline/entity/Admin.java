/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.entityAdmin.java
 * 作  者：刘卜铷
 * 日  期：2016年11月25日 下午5:12:07
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.entity;

import org.springframework.stereotype.Component;

/**
 * 管理员
 * @author 刘卜铷
 * @date 2016年11月25日 下午5:14:20
 */
public class Admin {
	/**
	 * 编号
	 */
	private int id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 密码
	 */
	private String password;

	public Admin() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}
	
	

	
}
