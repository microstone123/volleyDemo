package com.volley;

import java.net.URLEncoder;

//http://www.tuling123.com/openapi/api?key=41ea422524e335ec9b99c630cc5c5f99&info=%E5%90%83%E9%A5%AD%E6%B2%A1&userid=
//http://120.24.45.113:9033/microwave.do?recipe=&text=清蒸鱼&step=-1
public class TulingInfo {

	private static final String recipeurl = "http://120.24.45.113:9033/microwave.do?";
	private static final String tulingurl = "http://www.tuling123.com/openap/api";
	private static final String tuLingKey = "41ea422524e335ec9b99c630cc5c5f99";
	private static final String userid = "CA7513231CD795C397DFC47ED8BE12E3";

	public static String getTulingParameter(String info) {
		return tulingurl + "?key=" + tuLingKey + "&info=" + URLEncoder.encode(info) + "&userid=" + userid;
	}

	public static String getrecipeParameter(String recipe,String text,int step) {
		return recipeurl + "?recipe=" + recipe + "&text=" + URLEncoder.encode(text) + "&step=" + step;
	}
}
