package com.narayanatutorial.complexjson.operations;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.narayanatutorial.vo.NarayanatutorialVO;

public class JsonFileToJavaObject {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fileReader = new FileReader("complexjsonfile.json");
		JsonParser parser = new JsonParser();
		Gson gson=new Gson();
		NarayanatutorialVO vo=gson.fromJson(fileReader, NarayanatutorialVO.class);
		
		System.out.println("Name:" + vo.getSkills().get(0));
	}
}
