package com.narayanatutorial.office;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

public class Main {
	public static void main(String[] args) throws Exception {
		try {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			FileReader fr = new FileReader("pnoresponse.json");
			JsonParser parser = new JsonParser();
			String jsonStr =parser.parse(fr).toString();
			
		
			
			System.out.println("jsonStr:"+jsonStr);
			GetProfileHierarchyPnoResponse res = gson.fromJson(jsonStr, GetProfileHierarchyPnoResponse.class);
			System.out.println("getRootAccountId:" + res.getResults().getGetProfileHierarchy().get(0).getStatusCd());

			
			GetProfileHierarchyDTOResponse dtoRes=new GetProfileHierarchyDTOResponse();
			GetProfileHierarchyDTOResponseBody dtoBody=new GetProfileHierarchyDTOResponseBody();
			dtoBody.setGetProfileHierarchy(res.getResults().getGetProfileHierarchy());
			dtoRes.setResults(dtoBody);
			String dtoResJson=gson.toJson(dtoRes);
			System.out.println("dtoResJson:"+dtoResJson);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
