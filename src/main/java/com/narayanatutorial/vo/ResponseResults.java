package com.narayanatutorial.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseResults {

	@JsonProperty("results")
	private ResponseBody results;

	public ResponseBody getResults() {
		return results;
	}

	public void setResults(ResponseBody results) {
		this.results = results;
	}

	

}
