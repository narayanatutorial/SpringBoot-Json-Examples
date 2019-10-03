package com.narayanatutorial.simplejson.operations;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.narayanatutorial.vo.EmployeeVO;
import com.narayanatutorial.vo.ResponseBody;
import com.narayanatutorial.vo.ResponseResults;

public class JavaObjectToJsonFile {
	public static void main(String[] args) throws Exception {
		Gson gson=new Gson();
		EmployeeVO employee = new EmployeeVO();
		employee.setAddress("Bangalore");
		employee.setName("narayanaswamy");
		List<EmployeeVO> list = new ArrayList<>();
		list.add(employee);

		ResponseBody resBody = new ResponseBody();
		resBody.setEmployee(list);

		ResponseResults resEx2 = new ResponseResults();
		resEx2.setResults(resBody);

		Object object = gson.toJson(resEx2);
		String jsonStr=object.toString();
		System.out.println("jsonStr:" +jsonStr);
		
		FileWriter fout=new FileWriter("javaobjectojson.json");
		gson.toJson(jsonStr, fout);
		fout.close();
	}
}
