package com.liang.utils;

import java.io.File;
import java.io.IOException;

public class PathUtil {
	
	public static String getArticlePath() throws IOException {
		
		File directory = new File("");
		String filePath=directory.getCanonicalPath();
//		System.out.println("获取标准的路径" + directory.getCanonicalPath());// 获取标准的路径
//		System.out.println("获取绝对路径" + directory.getAbsolutePath());// 获取绝对路径
		//实际部署在linux系统的tomcat下的情况
		if("bin".equals(filePath.substring(filePath.length()-3,filePath.length()))) {
			// 用于保存图片上传路径
			filePath = filePath.substring(0,filePath.length()-4) + PropertyUtil.getPropertiesPath().getProperty("articlePath");
		}else {//在eclipse上运行的情况
			// 用于保存图片上传路径
			filePath = directory.getCanonicalPath() + PropertyUtil.getPropertiesPath().getProperty("articlePath");
		}
		
		return filePath;
	}
	
public static String getUserPath() throws IOException {
		
		File directory = new File("");
		String filePath=directory.getCanonicalPath();
//		System.out.println("获取标准的路径" + directory.getCanonicalPath());// 获取标准的路径
//		System.out.println("获取绝对路径" + directory.getAbsolutePath());// 获取绝对路径
		//实际部署在linux系统的tomcat下的情况
		if("bin".equals(filePath.substring(filePath.length()-3,filePath.length()))) {
			// 用于保存图片上传路径
			filePath = filePath.substring(0,filePath.length()-4) + PropertyUtil.getPropertiesPath().getProperty("userPath");
		}else {//在eclipse上运行的情况
			// 用于保存图片上传路径
			filePath = directory.getCanonicalPath() + PropertyUtil.getPropertiesPath().getProperty("userPath");
		}
		
		return filePath;
	}
}
