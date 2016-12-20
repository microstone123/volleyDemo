package com.volley;

import com.alibaba.fastjson.annotation.JSONField;

public class Head {

	private String UserID;

	private String Nonce;

	private String TimeStamp;

	private String RequestID;

	private String UserSignature;

	private String AppID;

	private String AppType;

	public Head() {
		super();
		UserID = "harry";
		Nonce = "234512";
		TimeStamp = "2356723456";
		RequestID = "Pic1Request";
		AppID = "050716";
		AppType = "android";
		UserSignature = "zwweoeow9y922jwp=";
	}

	@JSONField(name="UserID")
	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	@JSONField(name="Nonce")
	public String getNonce() {
		return Nonce;
	}

	@JSONField(name="AppID")
	public String getAppID() {
		return AppID;
	}

	public void setAppID(String appID) {
		AppID = appID;
	}

	@JSONField(name="AppType")
	public String getAppType() {
		return AppType;
	}

	public void setAppType(String appType) {
		AppType = appType;
	}

	public void setNonce(String nonce) {
		Nonce = nonce;
	}

	@JSONField(name="TimeStamp")
	public String getTimeStamp() {
		return TimeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}

	@JSONField(name="RequestID")
	public String getRequestID() {
		return RequestID;
	}

	public void setRequestID(String requestID) {
		RequestID = requestID;
	}

	@JSONField(name="UserSignature")
	public String getUserSignature() {
		return UserSignature;
	}

	public void setUserSignature(String userSignature) {
		UserSignature = userSignature;
	}

}
