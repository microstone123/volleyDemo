package com.volley;

import com.google.gson.annotations.Expose;

public class PicRecognizeParamet {
	@Expose
	private Head head = new Head();
	@Expose
	private Body body = new Body();

	public PicRecognizeParamet() {
		super();
		// this.head = new Head();
		// this.body = new Body();
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	class Head {
		@Expose
		private String UserID;
		@Expose
		private String Nonce;
		@Expose
		private String TimeStamp;
		@Expose
		private String RequestID;
		@Expose
		private String UserSignature;

		public Head() {
			super();
			UserID = "harry";
			Nonce = "234512";
			TimeStamp = "2356723456";
			RequestID = "Pic1Request";
			UserSignature = "zwweoeow9y922jwp=";
		}

		public String getUserID() {
			return UserID;
		}

		public void setUserID(String userID) {
			UserID = userID;
		}

		public String getNonce() {
			return Nonce;
		}

		public void setNonce(String nonce) {
			Nonce = nonce;
		}

		public String getTimeStamp() {
			return TimeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			TimeStamp = timeStamp;
		}

		public String getRequestID() {
			return RequestID;
		}

		public void setRequestID(String requestID) {
			RequestID = requestID;
		}

		public String getUserSignature() {
			return UserSignature;
		}

		public void setUserSignature(String userSignature) {
			UserSignature = userSignature;
		}

	}

	class Body {
		@Expose
		private String ActionName;
		@Expose
		private String Version;

		public Body() {
			super();
			ActionName = "RecipeRecognition";
			Version = "v1.0";
		}

		public String getActionName() {
			return ActionName;
		}

		public void setActionName(String actionName) {
			ActionName = actionName;
		}

		public String getVersion() {
			return Version;
		}

		public void setVersion(String version) {
			Version = version;
		}
	}
}
