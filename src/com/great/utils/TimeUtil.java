package com.great.utils;

import java.util.Calendar;

/**
 * 时间工具类
 * 
 * @author jinayu
 *
 */
public class TimeUtil {

	/**
	 * 获取当前时间
	 * 
	 * @return
	 */
	public static String getTime() {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		return year + "-" + (month < 10 ? "0" + month : month) + "-" + date;
	}
}
