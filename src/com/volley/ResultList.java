package com.volley;

import com.alibaba.fastjson.annotation.JSONField;

public class ResultList {

	private String ImageName;

	private String probability;

	public ResultList(String imageName, String probability) {
		super();
		ImageName = imageName;
		this.probability = probability;
	}

	@JSONField(name="ImageName")
	public String getImageName() {
		return ImageName;
	}

	public void setImageName(String imageName) {
		ImageName = imageName;
	}

	@JSONField(name="probability")
	public String getProbability() {
		return probability;
	}

	public void setProbability(String probability) {
		this.probability = probability;
	}

}
