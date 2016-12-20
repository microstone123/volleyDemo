package com.volley;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.android.volley.MultipartRequest;
import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.part.FilePart;
import com.android.volley.part.Part;
import com.android.volley.part.StringPart;
import com.android.volley.toolbox.StringRequest;

public class MainActivity extends BaseActivity {
	private StringRequest stringRequest;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
		postRecipeData();
		// getRecipeData("", "清蒸鱼", -1);
		Log.e("onCreate", "onCreate");
	}

	protected void getTulingData(String info) {
		Log.e("101", "start 101");
		stringRequest = new StringRequest(Method.GET, TulingInfo.getTulingParameter(info), responseListener(),
				errorListener());
		executeRequest(101, stringRequest);
	}

	protected void getRecipeData(String recipe, String info, int step) {
		Log.e("102", "start 102");
		stringRequest = new StringRequest(Method.GET, TulingInfo.getrecipeParameter(recipe, info, step),
				responseListener(), errorListener());
		executeRequest(102, stringRequest);
	}

	protected void postRecipeData() {
		Log.e("102", "start 102");
		// stringRequest = new StringRequest(Method.POST,
		// "http://120.25.100.145/PicRecognize", responseListener(),
		// errorListener());
		getStringRequest("/storage/emulated/0/1006.jpg");
	}

	private void getStringRequest(String path) {

		// 构造参数列表
		List<Part> partList = new ArrayList<Part>();
		PicRecognizeParamet picRecognizeParamet = new PicRecognizeParamet();
		String jData = JSON.toJSONString(picRecognizeParamet);
		partList.add(new StringPart("JsonData", jData));
		try {
			partList.add(new FilePart("photo", new File(path)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String url = "http://120.25.100.145/PicRecognize";
		// 生成请求
		MultipartRequest profileUpdateRequest = new MultipartRequest(url, partList.toArray(new Part[partList.size()]),
				responseListener(), errorListener());
		// 将请求加入队列
		executeRequest(105, profileUpdateRequest);
	}

	protected Response.Listener<String> responseListener() {
		return new Response.Listener<String>() {

			@Override
			public void onResponse(Object tag, String response) {
				tv.setText(tag.toString() + " onResponse:" + response);
			}
		};
	}

	protected Response.ErrorListener errorListener() {
		return new Response.ErrorListener() {
			@Override
			public void onErrorResponse(VolleyError error) {
				// 处理失败错误信息
				Log.e("MultipartRequest", error.getMessage(), error);
				Toast.makeText(getApplication(), error.getMessage(), Toast.LENGTH_SHORT).show();
			}
		};
	}
}
