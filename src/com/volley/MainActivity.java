package com.volley;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

public class MainActivity extends BaseActivity {
	private StringRequest stringRequest;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
		getTulingData("清蒸鱼");
		getRecipeData("", "清蒸鱼", -1);
	}

	protected void getTulingData(String info) {
		tag = 101;
		stringRequest = new StringRequest(Method.GET, TulingInfo.getTulingParameter(info), responseListener(),
				errorListener());
		executeRequest(tag, stringRequest);
	}

	protected void getRecipeData(String recipe, String info, int step) {
		tag = 102;
		stringRequest = new StringRequest(Method.GET, TulingInfo.getrecipeParameter(recipe, info, step),
				responseListener(), errorListener());
		executeRequest(tag, stringRequest);
	}

	protected Response.Listener<String> responseListener() {
		return new Response.Listener<String>() {

			@Override
			public void onResponse(Object tag, String response) {
				Log.e("responseListener", "tag:" + tag + "   response:" + response);
				// tv.setText(text);

			}
		};
	}

	protected Response.ErrorListener errorListener() {
		return new Response.ErrorListener() {
			@Override
			public void onErrorResponse(VolleyError error) {
				Log.e("responseListener", error.getTag()+"");
			}
		};
	}
}
