package cn.sunline.enums;
/**
 * Copyright (C) 2002-2016 江西财经大学软通学院 文件名：EroEnum.java 作 者：刘卜铷 日 期：2016年11月28日
 * 下午12:21:46 描 述： 版 本：1.0
 */

public enum EroEnum {
	NO_ABILITY_ACCESS(1001, "没有权限访问");

	/**
	 * 状态吗
	 */
	private int state;

	/**
	 * 异常详情
	 */
	private String info;

	private EroEnum(int state, String info) {
		this.state = state;
		this.info = info;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public static EroEnum stateOf(int state) {
		for (EroEnum eroEnum : values()) {
			if (eroEnum.getState() == state) {
				return eroEnum;
			}
		}
		return null;
	}

}
