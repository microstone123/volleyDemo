package com.volley;

import android.app.Application;

import com.volley.http.RequestManager;

public class SpeechApp extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		init();

	}

	private void init() {
		RequestManager.init(this);
	}
}
