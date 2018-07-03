package com.great.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

import java.lang.reflect.Type;

/**
 * Json工具类
 * 
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午2:53:36
 * @Git 
 *
 */
public class GsonUtil {
	
	private static Gson gson = new GsonBuilder().create();
	private static JsonParser parser = new JsonParser();

	public static String toJson(Object value) {
		return gson.toJson(value);
	}

	public static <T> T fromJson(String json, Class<T> classOfT) throws JsonParseException {
		return gson.fromJson(json, classOfT);
	}

	@SuppressWarnings("unchecked")
	public static <T> T fromJson(String json, Type typeOfT) throws JsonParseException {
		return (T) gson.fromJson(json, typeOfT);
	}

	/**
	 * 获取OCR识别结果
	 * 
	 * @param json
	 * @return
	 */
	public static String getResultString(String json) {

		String result = "";
		if (!"".equals(json) && json != null) {

			// 字符串转为JsonObject对象
			JsonObject obj = parser.parse(json).getAsJsonObject();

			// 获取JSON结果
			String code = obj.get("code").getAsString();
			String message = obj.get("message").getAsString();

			// 判断code和message
			if ("0".equals(code) && "OK".equals(message)) {

				// 获取items
				JsonElement element = obj.get("data").getAsJsonObject().get("items");

				// 获取JSON数组首个元素
				JsonObject object = element.getAsJsonArray().get(0).getAsJsonObject();

				// 返回识别结果
				result = object.get("itemstring").getAsString();
			} else {
				result = "failOcr";
			}
		}
		return result;
	}
}
