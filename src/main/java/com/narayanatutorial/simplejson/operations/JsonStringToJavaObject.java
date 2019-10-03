package com.narayanatutorial.simplejson.operations;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.narayanatutorial.vo.ResponseResults;

public class JsonStringToJavaObject {

	public static void main(String[] args) throws Exception {

		FileReader fileReader=new FileReader("jsondata.json");
		JsonParser parser=new JsonParser();
		Object obj=parser.parse(fileReader);
		String jsonStr=obj.toString();
		System.out.println("jsonStr:"+jsonStr);
		
		Gson gson=new Gson();
		//json string to java object
		ResponseResults responseResults=gson.fromJson(jsonStr, ResponseResults.class);
		
		System.out.println("Name:"+responseResults.getResults().getEmployee().get(0).getName());
		System.out.println("Address:"+responseResults.getResults().getEmployee().get(0).getAddress());
	}
	
}
