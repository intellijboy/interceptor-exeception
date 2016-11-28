/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.junitJunitSpring.java
 * 作  者：刘卜铷
 * 日  期：2016年11月28日 上午9:07:45
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.sunline.control.exclude.ExcludeCompoment;
import cn.sunline.entity.Admin;
import cn.sunline.vo.Car;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-*.xml"})
public class JunitSpring {

	
	@Autowired(required=false)
	private Admin admin;
	
	@Autowired(required=false)
	private Car car;
	
	
	@Autowired(required=false)
	private ExcludeCompoment compoment;
	
	@Test
	public void TestAtuware(){
		System.out.println("admin==>"+admin);
		System.out.println("compoment==>"+compoment);
		System.out.println("car==>"+car);
	}
}
