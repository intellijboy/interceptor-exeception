/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.entityUser.java
 * 作  者：刘卜铷
 * 日  期：2016年11月28日 上午10:25:49
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.entity;

public class User {
		private int id;
		private String name;
		private String password;
		public User() {
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
			return "User [id=" + id + ", name=" + name + ", password="
					+ password + "]";
		}
		
		
}
