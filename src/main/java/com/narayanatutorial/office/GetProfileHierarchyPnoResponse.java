package com.narayanatutorial.office;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GetProfileHierarchyPnoResponse {
	
	 @JsonProperty(value="results")	 
	 private GetProfileHierarchyDTOResponseBody results;

	public GetProfileHierarchyDTOResponseBody getResults() {
		return results;
	}

	public void setResults(GetProfileHierarchyDTOResponseBody results) {
		this.results = results;
	}
	 
}
