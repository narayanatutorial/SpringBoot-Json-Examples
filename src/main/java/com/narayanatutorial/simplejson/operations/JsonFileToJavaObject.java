package com.narayanatutorial.simplejson.operations;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonParser;

public class JsonFileToJavaObject {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fileReader = new FileReader("jsondata.json");
		JsonParser parser = new JsonParser();

		//json file to string object
		Object obj = parser.parse(fileReader);
		String jsonStr = obj.toString();
		System.out.println("jsonStr:" + jsonStr);
	}
}
