/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.voCar.java
 * 作  者：刘卜铷
 * 日  期：2016年11月28日 下午12:03:09
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.vo;

public class Car {
		private int id;
		private String name;
		public Car() {
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
		@Override
		public String toString() {
			return "Car [id=" + id + ", name=" + name + "]";
		}
		
		
}
