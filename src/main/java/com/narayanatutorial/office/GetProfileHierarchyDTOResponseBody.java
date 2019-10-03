package com.narayanatutorial.office;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GetProfileHierarchyDTOResponseBody {
	
	@JsonProperty(value="getAccountInfo")
	private List<GetProfileHierarchyPnoInfo> getAccountInfo = new ArrayList<>();

	public List<GetProfileHierarchyPnoInfo> getGetProfileHierarchy() {
		return getAccountInfo;
	}

	public void setGetProfileHierarchy(List<GetProfileHierarchyPnoInfo> getProfileHierarchy) {
		this.getAccountInfo = getProfileHierarchy;
	}

	
	
	

}
