package com.volley;

import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.android.volley.Request;
import com.volley.http.RequestManager;

public class BaseActivity extends FragmentActivity {
	public Object tag;

	@Override
	protected void onDestroy() {
		super.onDestroy();
		RequestManager.cancelAll(tag);
	}

	protected void executeRequest(Object tag, Request<?> request) {
		RequestManager.addRequest(tag, request);
		Log.d("request.getUrl()", request.getUrl());
	}

}
