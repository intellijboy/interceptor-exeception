/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.control.excludeExcludeControl.java
 * 作  者：刘卜铷
 * 日  期：2016年11月28日 上午9:20:58
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.control.exclude;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class ExcludeCompoment {
		private int id;
		private String name;
		public ExcludeCompoment() {
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
			return "ExcludeCompoment [id=" + id + ", name=" + name + "]";
		}
		
}
