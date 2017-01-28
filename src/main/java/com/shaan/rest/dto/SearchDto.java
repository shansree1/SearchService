package com.shaan.rest.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.shaan.rest.model.SearchResponceModel;

@XmlRootElement
public class SearchDto {

	private List<SearchResponceModel> data;
	private Boolean exception;

	public Boolean getException() {
		return exception;
	}

	public void setException(Boolean exception) {
		this.exception = exception;
	}

	public List<SearchResponceModel> getData() {
		return data;
	}

	public void setData(List<SearchResponceModel> data) {
		this.data = data;
	}

}
