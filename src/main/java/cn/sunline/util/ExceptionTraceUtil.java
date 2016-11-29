/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.utilExceptionTraceUtil.java
 * 作  者：刘卜铷
 * 日  期：2016年11月29日 上午9:21:12
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.util;

import java.util.ArrayList;
import java.util.List;

public class ExceptionTraceUtil {
		public static List<String> getTrace(Throwable ex){
			List<String> resultTrace = new ArrayList<String>();
			StackTraceElement[] stackTrace = ex.getStackTrace();
			String className;
			String fileName;
			String methodName ;
			int lineNumber;
			for (int i = 0; i < stackTrace.length; i++) {
				StackTraceElement stackTraceElement = stackTrace[i];
				className = stackTraceElement.getClassName();
				fileName = stackTraceElement.getFileName();
				methodName = stackTraceElement.getMethodName();
				lineNumber = stackTraceElement.getLineNumber();
				resultTrace.add(className+"."+methodName+"("+fileName+"):"+lineNumber);
		//		System.out.println(className+"."+methodName+"("+fileName+"):"+lineNumber);
			}
			return resultTrace;
		}
}
