package com.volley;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class Body {

	private String ImageName;

	private int Version;

	private String FileType;

	// Recipe:菜谱识别 Ingredient:食材识别
	private String RecognizeType;

	@JSONField(name="ResultList")
	private List<ResultList> ResultList;

	public Body() {
		super();
		ImageName = "broccoli";
		Version = 1;
	}

	@JSONField(name="ImageName")
	public String getImageName() {
		return ImageName;
	}

	public void setImageName(String imageName) {
		ImageName = imageName;
	}

	@JSONField(name="Version")
	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = version;
	}

	@JSONField(name="RecognizeType")
	public String getRecognizeType() {
		return RecognizeType;
	}

	public void setRecognizeType(String recognizeType) {
		RecognizeType = recognizeType;
	}

	@JSONField(name="FileType")
	public String getFileType() {
		return FileType;
	}

	public void setFileType(String fileType) {
		this.FileType = fileType;
	}

	public List<ResultList> getResultList() {
		return ResultList;
	}

	public void setResultList(List<ResultList> resultList) {
		ResultList = resultList;
	}

}
