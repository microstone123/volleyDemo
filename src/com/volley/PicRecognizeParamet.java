package com.volley;

import java.util.ArrayList;
import java.util.List;

public class PicRecognizeParamet {
	private Head head = new Head();
	private Body body = new Body();

	public PicRecognizeParamet() {
		super();
		// this.head = new Head();
		// this.body = new Body();
	}

	public Head getHead() {
		return head;
	}

	public void setResultListData(String reData, String checkData) {
		List<ResultList> list = new ArrayList<>();
		list.add(new ResultList(reData, checkData));
		body.setResultList(list);
	}

	public void setImageData(String checkData) {
		body.setImageName(checkData);
	}

	public void setRecognizeType(String recognizeType) {
		body.setRecognizeType(recognizeType);
	}

	public void setFileType(String fileType) {
		body.setFileType(fileType);
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

}
